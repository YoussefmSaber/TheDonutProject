package com.youssefmsaber.thedonutproject.composable.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.composable.utils.dropShadow
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun QuantityCards() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Padding20),
        modifier = Modifier.padding(bottom = Padding16)
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = White
            ),
            modifier = Modifier
                .dropShadow(
                    blur = 40.dp
                )
                .size(45.dp),
            onClick = {}
        ) {
            Text(
                "-",
                style = TextStyle(
                    fontFamily = INTER,
                    color = Black,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium,
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        Card(
            colors = CardDefaults.cardColors(
                containerColor = White
            ),
            modifier = Modifier
                .dropShadow(
                    blur = 40.dp
                )
                .size(45.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    "1",
                    style = TextStyle(
                        fontFamily = INTER,
                        color = Black,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Black
            ),
            modifier = Modifier
                .dropShadow(
                    blur = 40.dp
                )
                .size(45.dp),
            onClick = {}
        ) {
            Text(
                "+",
                style = TextStyle(
                    fontFamily = INTER,
                    color = White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium,
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview
@Composable
private fun QuantityCardsPreview() {
    QuantityCards()
}