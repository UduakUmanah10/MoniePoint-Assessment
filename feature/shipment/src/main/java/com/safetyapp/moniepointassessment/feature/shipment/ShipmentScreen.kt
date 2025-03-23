package com.safetyapp.moniepointassessment.feature.shipment



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun Tabchip(
    modifier: Modifier = Modifier
    .height(17.dp)
    .width(27.dp)) {
    Surface(
        modifier=modifier,
        color = Color.Red,
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            Text(text = "12", fontSize = 8.sp)
        }

    }


}

//
@Composable
fun IconandText() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.wrapContentWidth().wrapContentHeight()

    ) {

        Icon(
            painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.loading),
            tint = Color.Blue,
            modifier = Modifier.size(20.dp),
            contentDescription = ""
        )

        Text(
            text="in-progress",
            fontSize = 15.sp,
            modifier = Modifier
                .wrapContentSize()
                .padding(start =4.dp, end = 5.dp)

                )

    }

}

@Composable
fun IconAndText(modifier: Modifier =  Modifier
    .padding(10.dp)
    .wrapContentWidth()
    .wrapContentHeight()
){
    Surface(
        modifier = modifier,
        color = Color.Red,
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.wrapContentWidth().padding(5.dp)
        ) {
            IconandText()
        }

    }
}





@PreviewAndLightDark
@Composable
fun rounded() {

    ShippingAppTheme {

        Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            Tabchip()
            IconandText()
            IconAndText()


        }


    }
}