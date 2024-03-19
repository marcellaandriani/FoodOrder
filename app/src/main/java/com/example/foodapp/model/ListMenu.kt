package com.example.foodapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListMenu(
    val name: String,
    val price: String,
    val unitPrice : Int,
    val menuPictUrl: String,
    val description : String,
    val address : String,
    val mapsUrl : String
) : Parcelable
