package com.youssefmsaber.thedonutproject.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.bar.BottomBar
import com.youssefmsaber.thedonutproject.composable.card.DonutsCard
import com.youssefmsaber.thedonutproject.composable.card.OfferCard
import com.youssefmsaber.thedonutproject.data.donutItems
import com.youssefmsaber.thedonutproject.data.offerItems
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightPink
import com.youssefmsaber.thedonutproject.ui.theme.Padding1
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding21
import com.youssefmsaber.thedonutproject.ui.theme.Padding24
import com.youssefmsaber.thedonutproject.ui.theme.Padding25
import com.youssefmsaber.thedonutproject.ui.theme.Padding38
import com.youssefmsaber.thedonutproject.ui.theme.Padding39
import com.youssefmsaber.thedonutproject.ui.theme.Padding4
import com.youssefmsaber.thedonutproject.ui.theme.Padding40
import com.youssefmsaber.thedonutproject.ui.theme.Padding46
import com.youssefmsaber.thedonutproject.ui.theme.Padding54
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.Radius15
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = White,
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.Transparent)
                .verticalScroll(rememberScrollState())
        ) {
            HeaderSection(Modifier)

            OfferSection(Modifier)
            DonutsSection(Modifier)

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
                .padding(start = Padding39, bottom = Padding25)
                .background(Color.Transparent)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = Padding40),
            horizontalArrangement = Arrangement.spacedBy(Padding21),
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
            .padding(bottom = Padding46)
    ) {
        Text(
            "Today Offers",
            style = TextStyle(
                color = Black,
                fontFamily = INTER,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier.padding(start = Padding39, bottom = Padding25)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = Padding40),
            horizontalArrangement = Arrangement.spacedBy(Padding8),
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
                start = Padding38,
                end = Padding40,
                top = Padding40,
                bottom = Padding54
            )
            .fillMaxWidth()
    ) {
        Column {
            Text(
                stringResource(R.string.let_s_gonuts),
                style = TextStyle(
                    color = PrimaryPink,
                    fontFamily = INTER,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(bottom = Padding4)
            )
            Text(
                stringResource(R.string.order_your_favourite_donuts_from_here),
                style = TextStyle(
                    color = Black.copy(0.6f),
                    fontSize = 14.sp,
                    fontFamily = INTER,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.padding(start = Padding1)
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

@Preview(showSystemUi = true, device = "spec:width=428dp,height=924dp")
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}