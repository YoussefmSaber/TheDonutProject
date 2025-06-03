package com.youssefmsaber.thedonutproject.composable.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.utils.dropShadow
import com.youssefmsaber.thedonutproject.entity.OfferEntity
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.Gray
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightBlue
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding4
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
import com.youssefmsaber.thedonutproject.ui.theme.Radius20

@Composable
fun OfferCard(offer: OfferEntity) {
    Box(
        modifier = Modifier
            .width(230.dp)
            .height(325.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(193.dp)
                .dropShadow(
                    offsetY = 16.dp,
                    blur = 40.dp,
                )
                .background(
                    offer.backgroundColor,
                    shape = RoundedCornerShape(Radius20)
                )
        ) {
            Column(
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .width(193.dp)
                    .padding(Padding16)
            ) {
                Text(
                    offer.title,
                    style = TextStyle(
                        color = Black,
                        fontFamily = INTER,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(bottom = Padding8)
                )
                Text(
                    offer.description,
                    style = TextStyle(
                        color = Gray,
                        fontFamily = INTER,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                    overflow = TextOverflow.Ellipsis,
                    minLines = 3,
                    maxLines = 3,
                    modifier = Modifier.padding(bottom = Padding8)
                )
                Row(
                    modifier = Modifier.align(Alignment.End),
                ) {
                    Text(
                        offer.oldPrice,
                        style = TextStyle(
                            color = Gray,
                            fontFamily = INTER,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            textDecoration = TextDecoration.LineThrough,
                            baselineShift = BaselineShift.Subscript
                        ),

                        modifier = Modifier.padding(end = Padding4)
                    )
                    Text(
                        offer.newPrice,
                        style = TextStyle(
                            color = Black,
                            fontFamily = INTER,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.SemiBold,
                        ),
                    )
                }
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            HeartCard(
                offer.isFavorite,
                modifier = Modifier.padding(
                    start = Padding16,
                    top = Padding16
                )
            )
            Image(
                painter = painterResource(offer.image),
                contentDescription = "Offer Image",
                modifier = Modifier
                    .align(Alignment.End)
                    .size(136.dp)
            )
        }
    }
}

@Preview
@Composable
fun OfferCardPreview() {
    OfferCard(
        OfferEntity(
            image = R.drawable.pink_donut,
            title = "Strawberry Wheel",
            description = "These Baked Strawberry Donuts are filled with fresh strawberries donuts with some sweetdecreasing sugar.",
            oldPrice = "$10",
            newPrice = "$8",
            backgroundColor = LightBlue,
            isFavorite = false
        )
    )
}