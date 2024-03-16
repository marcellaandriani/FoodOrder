package com.example.foodapp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.CatagoryAdapter
import com.example.foodapp.presentation.MenuList.adapter.MenuAdapter
import com.example.foodapp.R
import com.example.foodapp.databinding.ActivityMainBinding
import com.example.foodapp.model.Catagory
import com.example.foodapp.model.ListMenu

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val catagoryAdapter = CatagoryAdapter()
    private val listmenuAdapter = MenuAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCatagory()

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


    }