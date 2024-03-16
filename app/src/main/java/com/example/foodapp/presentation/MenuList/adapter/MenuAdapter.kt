package com.example.foodapp.presentation.MenuList.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodapp.base.ViewHolderBinder
import com.example.foodapp.databinding.ItemGridMenuBinding
import com.example.foodapp.databinding.ItemListMenuBinding
import com.example.foodapp.model.ListMenu

class MenuAdapter(private val listMode: Int = MODE_LIST) : RecyclerView.Adapter<ViewHolder>() {

    companion object {
        const val MODE_LIST = 0
        const val MODE_GRID = 1
    }

    private var asyncDataDiffer = AsyncListDiffer(
        this,object : DiffUtil.ItemCallback<ListMenu>(){

            override fun areItemsTheSame(oldItem: ListMenu, newItem: ListMenu): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: ListMenu, newItem: ListMenu): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

        }
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (listMode == MODE_GRID)
            MenuGridItemViewHolder(
            ItemGridMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        ) else {
            MenuListItemViewHolder(
                ItemListMenuBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemCount(): Int = asyncDataDiffer.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder !is ViewHolderBinder<*>) return
        (holder as ViewHolderBinder<ListMenu>).bind(asyncDataDiffer.currentList[position])
    }
}
