package com.youssefmsaber.thedonutproject.data

import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.entity.OfferEntity
import com.youssefmsaber.thedonutproject.ui.theme.LightBlue
import com.youssefmsaber.thedonutproject.ui.theme.LittleLightPink

val offerItems = listOf(
    OfferEntity(
        image = R.drawable.pink_donut,
        title = "Strawberry Wheel",
        description = "These Baked Strawberry Donuts are filled with fresh strawberries donuts with some sweetdecreasing sugar.",
        oldPrice = "$20",
        newPrice = "$16",
        backgroundColor = LightBlue,
    ),
    OfferEntity(
        image = R.drawable.choco_donut,
        title = "Chocolate Glaze",
        description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
        oldPrice = "$20",
        newPrice = "$16",
        backgroundColor = LittleLightPink,
    ),
)