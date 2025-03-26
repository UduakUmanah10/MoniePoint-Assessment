package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme
import androidx.compose.runtime.*


@Composable
fun estimateScreen(
    backToHome: () -> Unit = {},
    count: Int = 4125
) {
    var oldCount by remember { mutableStateOf(count) }
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .height(100.dp)
                .width(250.dp),
            painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.textimage),
            contentDescription = ""
        )

        AnimatedBoxEntry {
            Image(
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp),
                painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.box2),
                contentDescription = ""
            )

        }




        Column(
            modifier = Modifier.padding(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedBoxEntry {
                Text(
                    text = " Total Estimated Amount ",
                    fontWeight = FontWeight.W500, fontSize = 30.sp
                )
            }

            AnimatedBoxEntry {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AnimatedCounterScreen()
                    Text("USD", fontWeight = FontWeight.W500, fontSize = 24.sp, color = Color.Green)

                }
            }

            AnimatedBoxEntry {

                Text(
                    " This amount is estimated this will vary",
                    fontWeight = FontWeight.Normal, fontSize = 18.sp
                )
            }

            AnimatedBoxEntry {
                Text(
                    " if you Change your location or Weight",
                    fontWeight = FontWeight.Normal, fontSize = 18.sp
                )
            }

        }

        AnimatedBoxEntry {
            Button(
                onClick = backToHome,
                modifier = Modifier
                    .padding(top = 40.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(50.dp)
            ) {
                Text("Back to home", fontSize = 18.sp)

            }
        }


    }


}

@PreviewAndLightDark
@Composable
fun previewEstimateScreen() {
    ShippingAppTheme {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {
            estimateScreen()

        }

    }

}
