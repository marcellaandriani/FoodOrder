package com.example.foodapp.data.datasource

import com.example.foodapp.model.ListMenu

interface FoodDataSource {
    fun getListMenu() : List<ListMenu>
}

class FoodDataSourceImpl : FoodDataSource {
    override fun getListMenu(): List<ListMenu> {
        return mutableListOf(
           ListMenu(
               name = "Crab Soup",
               price = "45.000",
               MenuPictUrl = "https://www.cameronsseafood.com/wp-content/uploads/2018/10/crabpumpkinsoup.jpg"
           ),
            ListMenu(
                name = "Orange Juice",
                price = "15.000",
                MenuPictUrl = "https://i0.wp.com/images-prod.healthline.com/hlcmsresource/images/AN_images/orange-juice-1296x728-feature.jpg?w=1155&h=1528"
            ),
            ListMenu(
                name = "Alpukat Kocok",
                price = "10.000",
                MenuPictUrl = "https://kataindonesia.com/wp-content/uploads/2020/09/Screenshot_20200904-114925_Word.jpg"
            ),
            ListMenu(
                name = "Chicken Salad",
                price = "35.000",
                MenuPictUrl = "https://img.hellofresh.com/f_auto,fl_lossy,q_auto,w_1200/hellofresh_s3/image/60f82b14b2a8d01a500fa86a-69e7f856.jpg"
            ),
        )
    }
}