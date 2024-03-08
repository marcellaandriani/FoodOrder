package com.example.foodapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.ItemListMenuBinding
import com.example.foodapp.model.ListMenu

class ListMenuAdapter : RecyclerView.Adapter<ListMenuAdapter.ListMenuViewHolder>() {

    private val data = mutableListOf<ListMenu>()

    fun submitData(items: List<ListMenu>) {
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMenuViewHolder {
        return ListMenuViewHolder(
            ItemListMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ListMenuViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class ListMenuViewHolder(private val binding: ItemListMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ListMenu) {
            binding.tvListmenuName1.text = item.name
            binding.ivListmenuImage1.setImageResource(item.image)
            binding.tvListmenuPrice1.text = "Rp ${item.price}"

        }
    }
}
