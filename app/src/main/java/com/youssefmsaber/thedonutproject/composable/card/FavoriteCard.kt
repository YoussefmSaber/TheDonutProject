package com.youssefmsaber.thedonutproject.composable.card

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.utils.dropShadow
import com.youssefmsaber.thedonutproject.ui.theme.Padding25
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.White


@Composable
fun FavoriteCard(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        modifier = modifier
            .dropShadow(
                offsetY = 4.dp,
                blur = 40.dp
            )
            .size(40.dp)
            .offset(y = (-22).dp),
        onClick = {}
    ) {
        Icon(
            painter = painterResource(R.drawable.sharp_heart_outline),
            contentDescription = "Heart Icon",
            tint = PrimaryPink,
            modifier = Modifier
                .padding(Padding8)
                .size(30.dp)
        )
    }
}

@Preview
@Composable
private fun FavoriteCardPreview() {
    FavoriteCard()
}