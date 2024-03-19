package com.example.foodapp.presentation.MenuList.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.foodapp.R
import com.example.foodapp.base.ViewHolderBinder
import com.example.foodapp.databinding.ItemListMenuBinding
import com.example.foodapp.model.ListMenu

class MenuListItemViewHolder(
    private val binding: ItemListMenuBinding,
    private val listener: ListMenuAdapter.OnItemClickedListener<ListMenu>

) : ViewHolder(binding.root), ViewHolderBinder<ListMenu>{

    override fun bind(item: ListMenu) {
        item.let {
            binding.ivListMenuImage1.load(it.menuPictUrl){
                crossfade(true)
                error(R.mipmap.ic_launcher)
            }
            binding.tvListMenuName1.text = it.name
            binding.tvListMenuPrice1.text = it.price
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }

        }
    }
}