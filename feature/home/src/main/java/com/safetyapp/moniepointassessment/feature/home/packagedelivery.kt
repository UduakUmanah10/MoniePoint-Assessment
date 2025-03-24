package com.safetyapp.moniepointassessment.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun packagedelivery(
    modifier: Modifier = Modifier.fillMaxWidth(),
    rightFirstText:String = "Sender",
    rightSecondText:String = "Atlanta 5243",
    leftFirstText:String = "Time",
    leftSecondText:String ="2 day -3days",
    surfaceColor:Color = Color.Green,
    showIndicator:Boolean =true,
    @DrawableRes image:Int = com.safetyapp.moniepointassessment.core.view.R.drawable.redbox
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        boxAndText(
            contentDescription = "",
            image = image,
            firstText = rightFirstText,
            secondText = rightSecondText,
            firstTextColor =  ShippingAppTheme.colorScheme.onPrimaryContainer,
            secondTextColor = ShippingAppTheme.colorScheme.secondary
        )

        leftContent(
            showIndicator =showIndicator,
            firstText = leftFirstText,
            secondText = leftSecondText,
            firstTextColor =  ShippingAppTheme.colorScheme.onPrimaryContainer,
            secondTextColor =ShippingAppTheme.colorScheme.secondary,
            surfaceColor = surfaceColor
        )


    }
}


@PreviewAndLightDark
@Composable
fun previewdelivery(){
    ShippingAppTheme {
        packagedelivery()

    }

}