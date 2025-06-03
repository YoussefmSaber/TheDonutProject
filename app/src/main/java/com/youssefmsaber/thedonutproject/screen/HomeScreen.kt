package com.youssefmsaber.thedonutproject.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.card.DonutsCard
import com.youssefmsaber.thedonutproject.composable.card.OfferCard
import com.youssefmsaber.thedonutproject.data.donutItems
import com.youssefmsaber.thedonutproject.data.offerItems
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightPink
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding24
import com.youssefmsaber.thedonutproject.ui.theme.Padding25
import com.youssefmsaber.thedonutproject.ui.theme.Padding4
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.Radius15
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = White,
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Transparent,
                contentColor = PrimaryPink,
                tonalElevation = 0.dp,
                actions = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        IconButton(onClick = {}) {
                            Icon(
                                painter = painterResource(R.drawable.home_filled),
                                contentDescription = "Home Screen",
                            )
                        }
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(R.drawable.heart_outline),
                                contentDescription = "Localized description",
                            )
                        }
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(R.drawable.notification_outline),
                                contentDescription = "Localized description",
                            )
                        }
                        IconButton(onClick = { }) {
                            BadgedBox(
                                badge = {
                                    Text(
                                        "2",
                                        fontSize = 2.sp,
                                        color = White,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .offset(x = (-6).dp, y = 2.dp)
                                            .align(Alignment.Center)
                                            .background(PrimaryPink, shape = CircleShape)
                                            .size(4.dp)
                                            .border(
                                                border = BorderStroke(width = 0.25.dp, White),
                                                shape = CircleShape
                                            )
                                            .offset(y = 0.75.dp)
                                    )
                                }
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.buy_outline),
                                    contentDescription = "Localized description",
                                )
                            }
                        }
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(R.drawable.profile_outline),
                                contentDescription = "Localized description",
                            )
                        }
                    }
                },
            )
        }
    ) { innerPadding ->
        ConstraintLayout(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.Transparent)
                .verticalScroll(rememberScrollState())
        ) {
            val (header, offer, donuts) = createRefs()
            HeaderSection(Modifier.constrainAs(header) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

            OfferSection(Modifier.constrainAs(offer) {
                top.linkTo(header.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
            DonutsSection(Modifier.constrainAs(donuts) {
                top.linkTo(offer.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        }
    }
}

@Composable
private fun DonutsSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Transparent)
            .padding(bottom = Padding24)
    ) {
        Text(
            "Donuts",
            style = TextStyle(
                color = Black,
                fontFamily = INTER,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .padding(start = Padding24, bottom = Padding25)
                .background(Color.Transparent)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = Padding24),
            horizontalArrangement = Arrangement.spacedBy(Padding24),
        ) {
            items(donutItems) {
                DonutsCard(it)
            }
        }
    }
}

@Composable
private fun OfferSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Transparent)
            .padding(bottom = Padding24)
    ) {
        Text(
            "Today Offers",
            style = TextStyle(
                color = Black,
                fontFamily = INTER,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier.padding(start = Padding24, bottom = Padding16)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = Padding24),
            horizontalArrangement = Arrangement.spacedBy(Padding8),
            modifier = Modifier
                .background(Color.Transparent)
        ) {
            items(offerItems) {
                OfferCard(it)
            }
        }
    }
}

@Composable
private fun HeaderSection(
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .padding(
                horizontal = Padding24,
                vertical = 54.dp
            )
            .fillMaxWidth()
    ) {
        Column {
            Text(
                "Let’s Gonuts!",
                style = TextStyle(
                    color = PrimaryPink,
                    fontFamily = INTER,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(bottom = Padding4)
            )
            Text(
                "Order your favourite donuts from here",
                style = TextStyle(
                    color = Black.copy(0.6f),
                    fontSize = 14.sp,
                    fontFamily = INTER,
                    fontWeight = FontWeight.Medium
                )
            )
        }
        OutlinedIconButton(
            onClick = {},
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = LightPink,
                contentColor = PrimaryPink,
            ),
            border = BorderStroke(0.dp, color = Color.Transparent),
            shape = RoundedCornerShape(Radius15),
            modifier = Modifier.size(45.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.round_search),
                contentDescription = "Search Icon",
                modifier = Modifier.size(35.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}