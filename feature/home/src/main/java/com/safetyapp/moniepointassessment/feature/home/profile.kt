package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun firstScreenContent(){


    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        color = ShippingAppTheme.colorScheme.primary
    ) {


        Column (
            modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            ProfileandIcon(
                surfaceBackgrounder = ShippingAppTheme.colorScheme.background,

            )
            searchText(
                surfaceBackgrounder = ShippingAppTheme.colorScheme.onPrimary,
                firstIconTint = ShippingAppTheme.colorScheme.primary

            )



    }
    }

}

@PreviewAndLightDark
@Composable
fun previewFirstHomeContent(){

    ShippingAppTheme {
        firstScreenContent()
    }


}