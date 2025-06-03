package com.youssefmsaber.thedonutproject.composable.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.utils.dropShadow
import com.youssefmsaber.thedonutproject.entity.Donuts
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.Padding12
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.Radius10
import com.youssefmsaber.thedonutproject.ui.theme.Radius20
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun DonutsCard(donut: Donuts) {
    Box(
        modifier = Modifier
            .width(138.dp)
            .height(150.dp)
    ) {
        Box(
            Modifier
                .height(110.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .dropShadow(
                    offsetY = 5.dp,
                    blur = 150.dp
                )
                .background(
                    White,
                    shape = RoundedCornerShape(
                        topStart = Radius20,
                        topEnd = Radius20,
                        bottomStart = Radius10,
                        bottomEnd = Radius10
                    )
                )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(vertical = Padding20, horizontal = Padding12)
            ) {

                Text(
                    donut.title,
                    style = TextStyle(
                        color = Black.copy(0.6f),
                        fontFamily = INTER,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(bottom = Padding12)
                )
                Text(
                    donut.price,
                    style = TextStyle(
                        color = PrimaryPink,
                        fontFamily = INTER,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }

        Image(
            painter = painterResource(donut.image),
            contentDescription = "Donut Image",
            modifier = Modifier
                .size(96.dp)
                .align(Alignment.TopCenter)
        )
    }
}

@Preview
@Composable
private fun DonutsCardPreview() {
    DonutsCard(
        Donuts(
            image = R.drawable.choco_strawberry,
            title = "Chocolate Cherry",
            price = "$22"
        )
    )
}