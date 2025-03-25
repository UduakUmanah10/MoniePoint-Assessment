package com.safetyapp.moniepointassessment.feature.shipment

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun lazyColumContent(
    modifier: Modifier = Modifier
        .wrapContentWidth()
        .wrapContentHeight(),
    @DrawableRes icon: Int = com.safetyapp.moniepointassessment.core.view.R.drawable.loading,
    tint: Color = Color.Blue,
    contentDescription: String = "",
    text: String = "pending",
    surfaceColor: Color = Color.Red,
    textColor: Color = Color.Yellow

) {

    Row(
        modifier =
            Modifier
                .height(200.dp)
                .fillMaxWidth()
                .padding(10.dp)
                .background(ShippingAppTheme.colorScheme.background),
        verticalAlignment = Alignment.CenterVertically
    ) {
        tabContent(
            modifier = modifier,
            icon = icon,
            tint = tint,
            contentDescription = contentDescription,
            text = text,
            surfaceColor = surfaceColor,
            textColor = textColor

        )
        Image(
            modifier = Modifier
                .padding(start = 3.dp, bottom = 12.dp, end = 10.dp)
                .height(100.dp)
                .width(100.dp),
            painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.box),
            contentDescription = "box"
        )
    }


}

@PreviewAndLightDark
@Composable
fun BoxPreview() {
    ShippingAppTheme {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {
            lazyColumContent()
        }

    }
}