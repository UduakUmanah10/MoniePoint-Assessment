package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.CustomCenteredTopAppBar
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateScreen(){

    Column(modifier = Modifier.fillMaxHeight()) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        CustomCenteredTopAppBar(
            scrollBehavior =scrollBehavior,
            centeredText =  stringResource(R.string.topAppbartext),
            leadingICon = R.drawable.backwardsarrow,
            iconColor = Color.Red,
            onLeadingIconClicked = {},
            titleContentColor = Color.Black,
            containerColor = Color.Magenta

        )


        Text(
            modifier = Modifier
                .padding(12.dp),
            text = "Destination",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        multipleTextInput()

        Text(
            modifier = Modifier
                .padding(start =12.dp, top = 12.dp),
            text = "Packaging",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            modifier = Modifier.padding(start=12.dp)
            ,
            text = "What are you Sending?",
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        )

        customSurface()

        Text(
            modifier = Modifier
                .padding(start =12.dp, top = 12.dp),
            text = "Categories",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            modifier = Modifier.padding(start=12.dp)
            ,
            text = "What are you Sending?",
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        )



    }

}










@PreviewAndLightDark
@Composable
fun PreviewCalculateScreen(){

    ShippingAppTheme{
        CalculateScreen()
    }


}