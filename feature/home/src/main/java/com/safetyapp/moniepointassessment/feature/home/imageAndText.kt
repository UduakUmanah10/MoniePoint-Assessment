package com.safetyapp.moniepointassessment.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun ImageandText(
    firstText:String ="Your Location",
    secondText:String ="Weathimer, llinois",
    firstIconDescription:String = "loaction",
    secondIconDescription:String = "downward arrow",
    imageContentDescription:String = "",
    @DrawableRes firstIcon:Int = com.safetyapp.moniepointassessment.core.view.R.drawable.near_me_24px,
    @DrawableRes secondIcon:Int = com.safetyapp.moniepointassessment.core.view.R.drawable.down_arrow,
    textColor: Color = Color.Red,
    IconColor: Color = Color.White
){

    Row(modifier = Modifier.wrapContentWidth()){
        Image(
            painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.tractor),
            contentDescription = imageContentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(50.dp)
                .clip(CircleShape)
        )

        Column(modifier = Modifier.padding(5.dp)) {
            Row {
                Icon(
                    painter = painterResource(id = firstIcon),
                    contentDescription = firstIconDescription,
                    modifier = Modifier.size(20.dp),
                    tint= IconColor

                )
                Text(
                    text =  firstText,
                    fontSize = 18.sp,
                    color = textColor
                )

            }
            Row(horizontalArrangement = Arrangement.Center) {
                Text(
                    text = secondText,
                    color = textColor,
                    fontWeight = FontWeight.W500,
                    fontSize = 20.sp
                )
                Icon(
                    painter = painterResource(id = secondIcon),
                    contentDescription = secondIconDescription,
                    modifier = Modifier
                        .padding(start = 2.dp, top = 2.dp)
                        .size(20.dp),
                    tint = IconColor
                )

            }

        }

    }


}

@Composable
fun IconSurface(
    surfaceBackgrounder: Color = Color.Red,
    surfaceShape: Shape = CircleShape,
    surfaceIconSize: Dp = 30.dp,
    surfaceIconColor: Color = Color.Black,
    contentDescription:String = "location",
    @DrawableRes   surfaceIcon:Int =com.safetyapp.moniepointassessment.core.view.R.drawable.notifications ,
    surfaceModifier:Modifier =Modifier
        .padding(5.dp)
        .size(50.dp),
){

    Surface(
        modifier = surfaceModifier,
        color = surfaceBackgrounder ,
        shape = surfaceShape,
        onClick = { /*TODO*/ },

        ) {

        Box(contentAlignment = Alignment.Center){
            Icon(
                painter = painterResource(id =surfaceIcon),
                contentDescription = contentDescription,
                modifier = Modifier.size(surfaceIconSize),
                tint =surfaceIconColor
            )

        }

    }
}

@Composable
fun ProfileandIcon(
    firstText: String = "Your Location",
    secondText: String = "Weathimer, llinois",
    firstIconDescription: String = "loaction",
    secondIconDescription: String = "downward arrow",
    imageContentDescription: String = "",
    @DrawableRes firstIcon: Int = com.safetyapp.moniepointassessment.core.view.R.drawable.near_me_24px,
    @DrawableRes secondIcon: Int = com.safetyapp.moniepointassessment.core.view.R.drawable.down_arrow,
    textColor: Color = Color.White,
    iconColor: Color = Color.White,
    surfaceBackgrounder: Color = Color.Red,
    surfaceShape: Shape = CircleShape,
    surfaceIconSize: Dp = 30.dp,
    surfaceIconColor: Color = Color.Black,
    contentDescription: String = "location"
){

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        ImageandText(
            firstText = firstText,
            secondText =secondText,
            firstIconDescription =firstIconDescription,
            secondIconDescription =secondIconDescription,
            imageContentDescription = imageContentDescription,
            firstIcon=firstIcon,
            secondIcon= secondIcon,
            textColor = textColor,
            IconColor=iconColor
        )
        IconSurface(
            surfaceBackgrounder =surfaceBackgrounder,
            surfaceShape= surfaceShape,
            surfaceIconSize=surfaceIconSize,
            surfaceIconColor=surfaceIconColor,
            contentDescription =contentDescription
        )
    }


}


@PreviewAndLightDark
@Composable
fun PreviewImageAndIcon() {

ShippingAppTheme{

    ProfileandIcon()

}

}