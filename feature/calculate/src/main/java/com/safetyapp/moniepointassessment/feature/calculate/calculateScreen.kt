package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.CustomCenteredTopAppBar
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.composables.customButton
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateScreen(
    onBackIconCLicked: () -> Unit = {},
    onCalculateClicked: () -> Unit = {}
){

    var text by remember { mutableStateOf("") }
    var secondText by remember { mutableStateOf("") }
    var thirdText by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxHeight().background(ShippingAppTheme.colorScheme.onSecondary)
    ) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        CustomCenteredTopAppBar(
            scrollBehavior =scrollBehavior,
            centeredText =  stringResource(R.string.topAppbartext),
            leadingICon = R.drawable.backwardsarrow,
            iconColor = ShippingAppTheme.colorScheme.background,
            onLeadingIconClicked = onBackIconCLicked,
            titleContentColor = ShippingAppTheme.colorScheme.background,
            containerColor = ShippingAppTheme.colorScheme.primary

        )


        Text(
            modifier = Modifier
                .padding(12.dp),
            text = "Destination",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = ShippingAppTheme.colorScheme.secondaryContainer
        )

        multipleTextInput(
            firstInputText = text,
            onFirstTextChanged = { text = it},
            secondTextInput = secondText,
            onSecondTextChanged = { secondText = it},
            thirdTextInput = thirdText,
            onThirdTextChanged = { thirdText = it}

        )

        Text(
            modifier = Modifier
                .padding(start =12.dp, top = 12.dp),
            text = "Packaging",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = ShippingAppTheme.colorScheme.secondaryContainer

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
            fontSize = 20.sp,
            color = ShippingAppTheme.colorScheme.secondaryContainer
        )
        Text(
            modifier = Modifier.padding(start=12.dp)
            ,
            text = "What are you Sending?",
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        )


        val selectedListItem = remember {
            mutableStateListOf(list[0])
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            flowrow(list, selectedList = selectedListItem, onOptionSelected = {
                if (it in selectedListItem) {
                    selectedListItem.remove(it)
                } else selectedListItem.add(it)
            })
        }

        customButton(
            onButtonClicked = onCalculateClicked,
            modifier = Modifier
                .padding(top =50.dp,start = 12.dp, end = 12.dp)
                .fillMaxWidth()
                .height(60.dp),
            buttonText = "Calculate"
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