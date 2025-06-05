package com.youssefmsaber.thedonutproject.composable.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.youssefmsaber.thedonutproject.R
import com.youssefmsaber.thedonutproject.ui.theme.INTER
import com.youssefmsaber.thedonutproject.ui.theme.Padding20
import com.youssefmsaber.thedonutproject.ui.theme.PrimaryPink
import com.youssefmsaber.thedonutproject.ui.theme.White

@Composable
fun CustomButton(
    text: String,
    textColor: Color,
    buttonColor: Color,
    verticalPadding: Dp,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor,
            contentColor = textColor
        ),
        onClick = onClick,
        contentPadding = PaddingValues(vertical = verticalPadding),
        modifier = modifier
    ) {
        Text(
            text,
            style = TextStyle(
                fontFamily = INTER,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
            )
        )
    }
}

@Preview
@Composable
private fun AddToCartButtonPreview() {
    CustomButton(
        text = stringResource(R.string.add_to_cart),
        textColor = White,
        buttonColor = PrimaryPink,
        verticalPadding = Padding20,
    )
}