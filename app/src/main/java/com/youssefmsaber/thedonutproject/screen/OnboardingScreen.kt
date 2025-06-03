package com.youssefmsaber.thedonutproject.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightPink
import com.youssefmsaber.thedonutproject.ui.theme.Padding12
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.Padding24
import com.youssefmsaber.thedonutproject.ui.theme.Padding34
import com.youssefmsaber.thedonutproject.ui.theme.Padding40
import com.youssefmsaber.thedonutproject.ui.theme.Padding60
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.SecondaryPink
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun OnboardingScreen() {

    Scaffold { innerPadding ->
        Box(
            Modifier
                .padding(innerPadding)
                .background(LightPink)
                .fillMaxSize()
                .clipToBounds()
        ) {
            Box {
                Image(
                    painter = painterResource(R.drawable.big_boss),
                    contentDescription = "Big donut image",
                    modifier = Modifier
                        .height(445.dp)
                        .scale(1.2f)
                        .offset(x = Padding20),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.align(Alignment.TopStart)
                ) {

                    Image(
                        painter = painterResource(R.drawable.purple_donut),
                        contentDescription = "Purple donut image",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .offset(x = (-Padding40), y = (-44).dp)
                            .scale(0.8f)
                            .size(186.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.donut_with_pink_icing_small),
                        contentDescription = "Purple donut image",
                        modifier = Modifier
                            .padding(top = Padding60, start = Padding16)
                            .height(70.dp)

                    )
                }
                Column(
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(R.drawable.donut_with_pink_icing),
                        contentDescription = "Purple donut image",
                        modifier = Modifier
                            .padding(horizontal = Padding34)
                            .padding(top = Padding40)
                            .height(125.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.eaten_donut),
                        contentDescription = "Purple donut image",
                        modifier = Modifier
                            .padding(top = 175.dp)
                            .height(165.dp)
                            .offset(x = 90.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = Padding40)
                    .padding(bottom = Padding24)
                    .align(Alignment.BottomCenter)
            ) {
                Text(
                    stringResource(R.string.gonuts_with_donuts),
                    style = TextStyle(
                        color = PrimaryPink,
                        fontFamily = INTER,
                        fontWeight = FontWeight.Bold,
                        fontSize = 54.sp
                    ),
                    modifier = Modifier
                        .width(193.dp)
                        .padding(bottom = Padding20)
                )
                Text(
                    stringResource(R.string.gonuts_with_donuts_is_a_sri_lanka_dedicated_food_outlets_for_specialize_manufacturing_of_donuts_in_colombo_sri_lanka),
                    style = TextStyle(
                        color = SecondaryPink,
                        fontFamily = INTER,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .padding(bottom = Padding60)
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = White,
                        contentColor = Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Get Started",
                        style = TextStyle(
                            color = Black,
                            fontFamily = INTER,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier.padding(vertical = Padding12)
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun OnboardingScreenPreview() {
    OnboardingScreen()
}