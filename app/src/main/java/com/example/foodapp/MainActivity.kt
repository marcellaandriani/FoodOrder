package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityMainBinding
import com.example.foodapp.model.Catagory
import com.example.foodapp.model.ListMenu

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val catagoryAdapter = CatagoryAdapter()
    private val listmenuAdapter = ListMenuAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCatagory()
        setListMenu()

    }

    private fun setListCatagory() {
        val data = listOf(
            Catagory(image = R.drawable.img_sup, name = "Soup"),
            Catagory(image = R.drawable.img_vegetables, name = "Salad"),
            Catagory(image = R.drawable.img_juice, name = "Juice"),
            Catagory(image = R.drawable.img_fruit, name = "Fruit"),
        )

        binding.rvCatagory.apply {
            adapter = this@MainActivity.catagoryAdapter
        }
        catagoryAdapter.submitData(data)
    }

    private fun setListMenu() {
            val data = listOf(
                ListMenu(image = R.drawable.img_orange, name = "Orange Juice", price = 15000.0),
                ListMenu(image = R.drawable.img_crab_soup, name = "Crab Soup", price = 45000.0),
                ListMenu(image = R.drawable.img_alpukat_kocok, name = "Alpukat Kocok", price = 10000.0),
                ListMenu(image = R.drawable.img_chicken_salad, name = "Chicken Salad", price = 35000.0)
            )

            binding.rvListMenu.apply {
                adapter = this@MainActivity.listmenuAdapter
            }
            listmenuAdapter.submitData(data)
        }
    }