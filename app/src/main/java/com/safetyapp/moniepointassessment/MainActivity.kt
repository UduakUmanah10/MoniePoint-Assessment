package com.safetyapp.moniepointassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShippingAppTheme {
                    AppRoot()

            }
        }
    }
}















@PreviewAndLightDark
@Composable
fun GreetingPreview() {
    ShippingAppTheme{
       AppRoot()
    }
}