package com.safetyapp.moniepointassessment.feature.shipment
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun BoxComposable(){
    Image(
        modifier = Modifier.padding( 100.dp).size(50.dp),
        painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.box),
        contentDescription = "box"
    )
}

@Composable
fun lazyColumContent(){

    Row(
        modifier = Modifier.height(200.dp).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        tabContent()
        Image(
            modifier = Modifier.padding(start = 3.dp, bottom = 12.dp, end = 10.dp).height(100.dp).width(100.dp),
            painter = painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.box),
            contentDescription = "box"
        )
    }


}

@PreviewAndLightDark
@Composable
fun BoxPreview(){
    ShippingAppTheme() {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()){
            lazyColumContent()

        }


    }

}