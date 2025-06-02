package com.youssefmsaber.thedonutproject.entity

import androidx.compose.ui.graphics.Color

data class OfferEntity(
    val image: Int,
    val title: String,
    val description: String,
    val oldPrice: String,
    val newPrice: String,
    val backgroundColor: Color,
    val isFavorite: Boolean = false
)