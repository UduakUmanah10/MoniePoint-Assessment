package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark

@Composable
fun OceanFreightCard() {
    // Animation to slide the image from left to right
    val offsetX = remember { Animatable(100f) } // Start off-screen to the left

    LaunchedEffect(Unit) {
        offsetX.animateTo(
            targetValue = 40f,
            animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
        )
    }

    Surface(
        modifier = Modifier
            .wrapContentWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        color = Color.White,
        tonalElevation = 2.dp, // Material 3 elevation
        shadowElevation = 4.dp

    ) {
        Box(
            modifier = Modifier
                .padding(16.dp).height(200.dp).width(120.dp)

        ) {
            Column(modifier = Modifier.align(Alignment.TopStart)) {
                Text(
                    text = "Ocean freight",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black
                )
                Text(
                    text = "International",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }

            Image(
                painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.ship), // Ensure "ship.PNG" is in res/drawable
                contentDescription = "Ship",
                //  contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(500.dp)
                    .offset(x = offsetX.value.dp, y = 40.dp) // Slide animation
                    .align(Alignment.BottomEnd)
            )
        }
    }
}



@Composable
@PreviewAndLightDark
fun prev(){

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        OceanFreightCard()

    }

}