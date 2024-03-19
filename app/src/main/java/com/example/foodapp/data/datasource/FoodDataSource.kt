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
               unitPrice = 45000 ,
               menuPictUrl = "https://www.cameronsseafood.com/wp-content/uploads/2018/10/crabpumpkinsoup.jpg",
               description = "Crab Soup adalah sebuah hidangan sup yang menggunakan daging kepiting sebagai bahan utamanya. Sup ini seringkali diolah dengan berbagai rempah-rempah dan bahan-bahan lainnya seperti sayuran, bawang, jahe, bawang putih, dan saus tomat untuk menciptakan rasa yang kaya dan lezat.",
               address = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
               mapsUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
           ),
            ListMenu(
                name = "Orange Juice",
                price = "15.000",
                unitPrice = 15000 ,
                menuPictUrl = "https://i0.wp.com/images-prod.healthline.com/hlcmsresource/images/AN_images/orange-juice-1296x728-feature.jpg?w=1155&h=1528",
                description = "Nikmati segarnya Orange Juice kami yang diperas dari jeruk-jeruk pilihan matang. Rasakan rasa manis dan segarnya yang membangkitkan semangat Anda sepanjang hari. Diperkaya dengan vitamin C dan nutrisi yang bermanfaat.",
                address = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapsUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            ListMenu(
                name = "Alpukat Kocok",
                price = "10.000",
                unitPrice = 10000 ,
                menuPictUrl = "https://kataindonesia.com/wp-content/uploads/2020/09/Screenshot_20200904-114925_Word.jpg",
                description = "Nikmati kelezatan Alpukat Kocok kami yang lezat dan menyegarkan! Diproses dari alpukat segar yang matang secara alami, minuman ini menghadirkan cita rasa alpukat yang lembut dan krimi. ",
                address = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapsUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            ListMenu(
                name = "Chicken Salad",
                price = "35.000",
                unitPrice = 35000 ,
                menuPictUrl = "https://img.hellofresh.com/f_auto,fl_lossy,q_auto,w_1200/hellofresh_s3/image/60f82b14b2a8d01a500fa86a-69e7f856.jpg",
                description = "Nikmati Chicken Salad kami yang segar dan lezat! Disiapkan dengan potongan daging ayam panggang yang lembut dan renyah, disajikan di atas campuran sayuran hijau segar yang diberi tambahan irisan tomat, mentimun, dan paprika.",
                address = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapsUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
        )
    }
}