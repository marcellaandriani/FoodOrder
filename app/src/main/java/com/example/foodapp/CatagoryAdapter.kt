package com.example.foodapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.ItemCatagoryBinding
import com.example.foodapp.model.Catagory


class CatagoryAdapter : RecyclerView.Adapter<CatagoryAdapter.CatagoryViewHolder>(){

    private val data = mutableListOf<Catagory>()

    fun submitData(items : List<Catagory>){
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatagoryViewHolder {
        return CatagoryViewHolder(
            ItemCatagoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CatagoryViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class CatagoryViewHolder(private val binding : ItemCatagoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Catagory){
            binding.tvCatagoryName1.text = item.name
            binding.ivCategory1.setImageResource(item.image)
        }

    }

}