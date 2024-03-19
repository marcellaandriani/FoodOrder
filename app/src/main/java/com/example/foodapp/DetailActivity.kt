package com.example.foodapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.foodapp.databinding.ActivityDetailBinding
import com.example.foodapp.model.ListMenu

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MENU = "EXTRA_MENU"
    }

    private lateinit var binding: ActivityDetailBinding
    private var quantity = 0
    private var totalPrice = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu = intent.getParcelableExtra<ListMenu>(EXTRA_MENU)
        menu?.let { displayMenuDetail(it) }
    }

    private fun displayMenuDetail(menu: ListMenu) {
        binding.apply {
            ivDetailMenu.load(menu.menuPictUrl) {
                crossfade(true)
            }
            binding.tvNameMenu.text = menu.name
            binding.tvPriceMenu.text = menu.price
            binding.tvDescMenu.text = menu.description
            binding.tvAddress.text = menu.address
            tvQuantity.text = quantity.toString()
            totalPrice = quantity * menu.unitPrice
            btnAddToCart.text = "Tambah ke Keranjang - Rp $totalPrice"
            ivRemove.setOnClickListener {
                if (quantity > 0) {
                    quantity--
                    tvQuantity.text = quantity.toString()
                    totalPrice = quantity * menu.unitPrice
                    btnAddToCart.text = "Tambah ke Keranjang - Rp $totalPrice"

                }
            }
            ivPlus.setOnClickListener {
                quantity++
                tvQuantity.text = quantity.toString()
                totalPrice = quantity * menu.unitPrice
                btnAddToCart.text = "Tambah ke Keranjang - Rp $totalPrice"

            }
            tvAddress.setOnClickListener(){
                val i = Intent(Intent.ACTION_VIEW)
                i.setData(Uri.parse(menu.mapsUrl))
                startActivity(i)
            }
        }
    }
}