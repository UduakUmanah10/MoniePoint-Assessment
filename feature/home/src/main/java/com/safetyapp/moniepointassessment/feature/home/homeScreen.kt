package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun homeScreen() {

    Column(modifier = Modifier.background(ShippingAppTheme.colorScheme.onSecondary).fillMaxHeight()) {
        firstScreenContent()

        Text(
            "Tracking",
            modifier = Modifier
                .padding(start = 12.dp, top = 15.dp, bottom = 15.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.W500
        )

        SecondScreenItem()

        Text(
            "Available Vehicles",
            modifier = Modifier
                .padding(start = 12.dp, top = 15.dp, bottom = 5.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.W500
        )

        lazyRowComposable()
    }
}


@PreviewAndLightDark
@Composable

fun PreviewHomeScreen() {
    ShippingAppTheme {
        homeScreen()

    }
}