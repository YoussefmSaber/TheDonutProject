package com.youssefmsaber.thedonutproject.composable.bar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.White


@Composable
fun BottomBar() {
    BottomAppBar(
        containerColor = Color.Transparent,
        contentColor = PrimaryPink,
        tonalElevation = 0.dp,
        contentPadding = PaddingValues(0.dp),
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
                                    .size(5.dp)
                                    .border(
                                        border = BorderStroke(width = 0.25.dp, White),
                                        shape = CircleShape
                                    )
                                    .offset(y = 1.5.dp, x = (-0.5).dp)
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

@Preview
@Composable
private fun BottomBarPreview() {
    BottomBar()
}