package com.safetyapp.moniepointassessment.feature.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun SecondScreenItem() {

    Surface(
        shape = RoundedCornerShape(10.dp),
        color =  ShippingAppTheme.colorScheme.background,

        modifier = Modifier
            .fillMaxWidth().padding(5.dp)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            // modifier = Modifier.padding(),
        ) {

            tractor(
                firstText = "Shipment Number",
                firstTextColor = ShippingAppTheme.colorScheme.onPrimaryContainer ,
                secondTextColor =  ShippingAppTheme.colorScheme.secondary,
                secondText = "NEJ0089934122231",
                imageContentDescription = "",
                tractorImage = com.safetyapp.moniepointassessment.core.view.R.drawable.tractor
            )

            HorizontalDivider(
                color = Color.Red,
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            )

            packagedelivery(
                modifier = Modifier.padding(12.dp).fillMaxWidth(),
                rightFirstText = "Sender",
                rightSecondText = "Atlanta 5243",
                leftFirstText = "Time",
                leftSecondText = "2 day -3days",
                surfaceColor = Color.Green,
                image = com.safetyapp.moniepointassessment.core.view.R.drawable.redbox
            )
            HorizontalDivider(
                color = Color.Red,
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            )

            packagedelivery(
                showIndicator = false,
                modifier = Modifier.padding(12.dp).fillMaxWidth(),
                rightFirstText = "Sender",
                rightSecondText = "Atlanta 5243",
                leftFirstText = "Time",
                leftSecondText = "2 day -3days",
                surfaceColor = Color.Green,
                image = com.safetyapp.moniepointassessment.core.view.R.drawable.greenbox
            )

            HorizontalDivider(
                color = Color.Red,
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            )

            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier,
                    text = " + Add Stop",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500,
                    color = ShippingAppTheme.colorScheme.onPrimary
                )

            }
        }
    }


}


@PreviewAndLightDark
@Composable
fun previewSecondScreenItem() {

    ShippingAppTheme {

        Column(modifier = Modifier.fillMaxSize().background(Color.Magenta)) {
            SecondScreenItem()

        }

    }


}