package com.safetyapp.moniepointassessment.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun tractor(
    firstText:String = "Shipment Number",
    firstTextColor: Color =Color.Red,
    secondTextColor: Color = Color.Red,
    secondText:String = "NEJ0089934122231",
    imageContentDescription:String ="",
    @DrawableRes tractorImage:Int = com.safetyapp.moniepointassessment.core.view.R.drawable.tractor
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){

        Column {
            Text(
                modifier = Modifier.padding(bottom = 12.dp),
                text =  firstText,
                fontSize = 15.sp,
                color = firstTextColor
            )
            Text(
                text =  secondText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = secondTextColor
            )


        }

        Image(
            painter = painterResource(id = tractorImage),
            contentDescription = imageContentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(50.dp)

        )

    }

}

@Composable
fun boxAndText(
    contentDescription:String ="",
    @DrawableRes image:Int =  com.safetyapp.moniepointassessment.core.view.R.drawable.redbox,
    firstText:String = "Sender",
    secondText:String = "Atlanta 5243",
    firstTextColor: Color = Color.Red,
    secondTextColor: Color = Color.Red
){
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

        ){

        Image(
            painter = painterResource(id = image),
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(end = 5.dp)
                .size(40.dp)
                .clip(CircleShape)
        )

        Column(modifier = Modifier.padding(5.dp)){

            Text(
                modifier = Modifier.padding(bottom = 9.dp),
                text =  firstText,
                fontSize = 15.sp,
                color = firstTextColor
            )
            Text(
                modifier = Modifier
                    .wrapContentHeight(),
                text =  secondText,
                fontSize = 18.sp,
                fontWeight = FontWeight.W500,
                color = secondTextColor
            )

        }


    }

}

@Composable
fun leftContent(
    firstText: String = "Time",
    secondText:String = " 2 day-3 days ",
    firstTextColor: Color = Color.Red,
    secondTextColor: Color = Color.Red,
    surfaceColor:Color =Color.Green,
    showIndicator:Boolean = true
){
    Column(modifier = Modifier.padding(5.dp).wrapContentWidth()){

        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text =  firstText,
            fontSize = 15.sp,
            color = firstTextColor
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if(showIndicator){
                Surface(
                    modifier = Modifier
                        .padding(4.dp)
                        .height(5.dp)
                        .width(5.dp),
                    shape = CircleShape,
                    color = surfaceColor
                ){  }

            }


            Text(
                modifier = Modifier
                    .wrapContentHeight(),
                text =  secondText,
                fontSize = 18.sp,
                fontWeight = FontWeight.W500,
                color = secondTextColor
            )

        }


    }
}

@Composable
fun textButton(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier
            ,
            text =  " + Add Stop",
            fontSize = 25.sp,
            fontWeight = FontWeight.W500,
            color = Color.Red
        )

    }



}



@PreviewAndLightDark
@Composable
fun Previewtractor(){
 ShippingAppTheme {

     Column(modifier = Modifier.fillMaxSize()){
         tractor()
         boxAndText()
         boxAndText(
             image=  com.safetyapp.moniepointassessment.core.view.R.drawable.greenbox,
             secondText = "Chicago 6342",
         )
         leftContent()
         textButton()



     }


 }

}
