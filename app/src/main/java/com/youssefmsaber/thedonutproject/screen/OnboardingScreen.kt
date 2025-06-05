package com.youssefmsaber.thedonutproject.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.composable.button.CustomButton
import com.youssefmsaber.thedonutproject.ui.theme.Black
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.LightPink
import com.youssefmsaber.thedonutproject.ui.theme.Padding1
import com.youssefmsaber.thedonutproject.ui.theme.Padding14
import com.youssefmsaber.thedonutproject.ui.theme.Padding16
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.Padding24
import com.youssefmsaber.thedonutproject.ui.theme.Padding40
import com.youssefmsaber.thedonutproject.ui.theme.Padding46
import com.youssefmsaber.thedonutproject.ui.theme.Padding54
import com.youssefmsaber.thedonutproject.ui.theme.Padding60
import com.youssefmsaber.thedonutproject.ui.theme.Padding8
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
                    painter = painterResource(R.drawable.onboarding_donut),
                    contentDescription = "Big donut image",
                    modifier = Modifier
                        .scale(1.75f)
                        .offset(y = Padding54, x = Padding8),
                )
            }
            Details(
                Modifier.align(Alignment.BottomCenter)
            )
        }
    }
}

@Composable
private fun Details(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = Padding40)
            .padding(bottom = Padding46)
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
                .padding(bottom = Padding20, end = Padding60)
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
                .padding(bottom = Padding60, end = Padding24)
        )

        CustomButton(
            text = stringResource(R.string.get_started),
            textColor = Black,
            buttonColor = White,
            verticalPadding = Padding14,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}


@Preview(showSystemUi = true, device = "spec:width=428dp,height=926dp")
@Composable
private fun OnboardingScreenPreview() {
    OnboardingScreen()
}