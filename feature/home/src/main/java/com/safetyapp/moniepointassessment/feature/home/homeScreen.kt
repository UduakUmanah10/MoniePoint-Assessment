package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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

    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {


        Column(
            modifier = Modifier
                .background(ShippingAppTheme.colorScheme.onSecondary)
                .fillMaxWidth()
                .fillMaxHeight()
                .verticalScroll(scrollState)
        ) {


                firstScreenContent()



            Text(
                "Tracking",
                modifier = Modifier
                    .padding(start = 12.dp, top = 15.dp, bottom = 15.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )

            AnimatedBoxEntryVertically{
                SecondScreenItem()
            }




            AnimatedEntryHorizontally() {
                Column {
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


        }
    }
}


@PreviewAndLightDark
@Composable

fun PreviewHomeScreen() {
    ShippingAppTheme {
        homeScreen()

    }
}