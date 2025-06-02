package com.youssefmsaber.thedonutproject.composable.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.Radius32
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun HeartCard(
    isFavorite: Boolean,
    cornerRadius: Dp = Radius32,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                White,
                shape = RoundedCornerShape(cornerRadius)
            )
            .size(36.dp)
    ) {
        Icon(
            painter = painterResource(
                if (!isFavorite)
                    R.drawable.sharp_heart_outline
                else
                    R.drawable.sharp_heart_filled
            ),
            contentDescription = "Favorite Icon",
            modifier = Modifier.align(Alignment.Center),
            tint = PrimaryPink,
        )
    }
}

@Preview
@Composable
private fun HeartCardPreview() {
    HeartCard(isFavorite = true)
}