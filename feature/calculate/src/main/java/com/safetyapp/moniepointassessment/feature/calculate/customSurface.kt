package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun customSurface() {

    Surface(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .height(70.dp),
        color =ShippingAppTheme.colorScheme.background,
        shape = ShippingAppTheme.shape.TextfieldShape
    ){

        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.loading),
//                contentDescription = "",
//                tint = ShippingAppTheme.colorScheme.error,
//                modifier = Modifier.size(30.dp),
//            )
            Image(
                painter = painterResource(id = R.drawable.box),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(3.dp)
                    .size(30.dp)
            )

            Icon(
                painter = painterResource(id = R.drawable.down_arrow),
                contentDescription = "",
                tint = ShippingAppTheme.colorScheme.error,
                modifier = Modifier.size(30.dp),
            )

        }

    }

}