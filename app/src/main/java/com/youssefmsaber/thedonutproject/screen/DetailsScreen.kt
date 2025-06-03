package com.youssefmsaber.thedonutproject.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.card.QuantityCards
import com.youssefmsaber.thedonutproject.composable.utils.dropShadow
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightPink
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.Padding25
import com.youssefmsaber.thedonutproject.ui.theme.Padding32
import com.youssefmsaber.thedonutproject.ui.theme.Padding34
import com.youssefmsaber.thedonutproject.ui.theme.Padding36
import com.youssefmsaber.thedonutproject.ui.theme.Padding40
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.Radius40
import com.youssefmsaber.thedonutproject.ui.theme.White

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun DetailsScreen() {
    Scaffold(
        bottomBar = {
            Box(
                Modifier.background(White)
                    .padding(Padding40)
            ) {
                AddToCart()
            }
        }
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxSize()
                    .background(White)
                    .verticalScroll(rememberScrollState())
            ) {

                val (topCard, bottomCard) = createRefs()
                Column(
                    Modifier
                        .background(LightPink)
                        .height(400.dp)
                        .fillMaxWidth()
                        .constrainAs(topCard) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                ) {
                    IconButton(
                        onClick = {}, Modifier
                            .align(Alignment.Start)
                            .padding(bottom = Padding8)
                            .padding(horizontal = Padding32, vertical = Padding16)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.back_arrow),
                            contentDescription = "Back Arrow",
                            tint = PrimaryPink,
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.pink_donut),
                        contentDescription = "Donut Details",
                        modifier = Modifier
                            .size(250.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                Box(
                    modifier = Modifier
                        .background(
                            color = White,
                            shape = RoundedCornerShape(topStart = Radius40, topEnd = Radius40)
                        )
                        .constrainAs(bottomCard) {
                            top.linkTo(topCard.bottom, margin = (-40).dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                            height = Dimension.fillToConstraints // ← key change
                        }
                        .fillMaxSize()

                ) {
                    FavoriteCard(
                        Modifier
                            .align(Alignment.TopEnd)
                    )
                    DetailsSection()
                }
            }
        }
    }
}

@Composable
private fun DetailsSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(horizontal = Padding40)
            .padding(top = Padding36)
    ) {
        DonutInfo()
        QuantitySection()
    }
}

@Composable
private fun DonutInfo() {
    // Title
    Text(
        "Strawberry Wheel",
        style = TextStyle(
            fontFamily = INTER,
            color = PrimaryPink,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        ),
        modifier = Modifier.padding(bottom = Padding34)
    )
    // About
    Text(
        "About Gonut",
        style = TextStyle(
            fontFamily = INTER,
            color = Black.copy(0.8f),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        ),
        modifier = Modifier.padding(bottom = Padding16)
    )
    // Description
    Text(
        "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
        style = TextStyle(
            fontFamily = INTER,
            color = Black.copy(0.6f),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.5.sp
        ),
        modifier = Modifier.padding(bottom = Padding25)
    )
}

@Composable
private fun QuantitySection() {
    Text(
        "Quantity",
        style = TextStyle(
            fontFamily = INTER,
            color = Black.copy(0.8f),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
        ),
        modifier = Modifier.padding(bottom = Padding20)
    )
    QuantityCards()
    Spacer(Modifier.height(Padding16))
}

@Composable
private fun AddToCart() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Padding20),
    ) {
        Text(
            "£16",
            style = TextStyle(
                fontFamily = INTER,
                color = Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                baselineShift = BaselineShift.Subscript
            ),
        )
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryPink,
                contentColor = White
            ),
            onClick = {},
            contentPadding = PaddingValues(vertical = Padding20),
            modifier = Modifier.weight(1f)
        ) {
            Text(
                "Add To Cart",
                style = TextStyle(
                    fontFamily = INTER,
                    color = White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            )
        }
    }
}

@Composable
private fun FavoriteCard(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        modifier = modifier
            .dropShadow(
                offsetY = 4.dp,
                blur = 40.dp
            )
            .padding(horizontal = Padding25)
            .size(40.dp)
            .offset(y = (-20).dp),
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

@Preview(showSystemUi = true)
@Composable
private fun DetailsScreenPreview() {
    DetailsScreen()
}