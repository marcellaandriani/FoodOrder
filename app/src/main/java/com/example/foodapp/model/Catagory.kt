package com.example.foodapp.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Catagory(
    var id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
)