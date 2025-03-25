package com.safetyapp.moniepointassessment.feature.shipment

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
fun tabContent(

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

    Column(modifier = Modifier
        .padding(5.dp)
        .wrapContentWidth()
        .height(170.dp)) {
        IconAndText(
            modifier = modifier,
            icon = icon,
            tint = tint,
            contentDescription = contentDescription,
            text = text,
            surfaceColor = surfaceColor,
            textColor = textColor
        )
        Text(
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            text = "Arriving today!",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            modifier = Modifier,
            text = "Your Delivery, #NEJ20089934122231",
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp
        )
        Text(
            text = "from atlanta, is arriving today",
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp
        )

        Row(
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("$370 USD", fontWeight = FontWeight.ExtraBold, fontSize = 15.sp)
            Surface(
                modifier = Modifier
                    .padding(7.dp)
                    .height(5.dp)
                    .width(5.dp),
                shape = CircleShape,
                color = Color.Black
            ) { }
            Text("Sep 20 2023", fontWeight = FontWeight.ExtraBold, fontSize = 14.sp)
        }
    }


}


@PreviewAndLightDark
@Composable
fun tabContentPreview() {
    tabContent()
}