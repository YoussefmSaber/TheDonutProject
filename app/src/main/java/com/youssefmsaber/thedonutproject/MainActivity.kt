package com.youssefmsaber.thedonutproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.youssefmsaber.thedonutproject.screen.DetailsScreen
import com.youssefmsaber.thedonutproject.screen.HomeScreen
import com.youssefmsaber.thedonutproject.screen.OnboardingScreen
import com.youssefmsaber.thedonutproject.ui.theme.TheDonutProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheDonutProjectTheme {
                OnboardingScreen()
//                HomeScreen()
//                DetailsScreen()
            }
        }
    }
}
