package com.safetyapp.moniepointassessment.feature.shipment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


data class
Tabitem(
    val title:String
)

val tabitems = listOf<Tabitem>(
    Tabitem("All"),
    Tabitem("Completed"),
    Tabitem("in Progress"),
    Tabitem("next"),
    Tabitem("home"),
    Tabitem("home"),
    Tabitem("home")

)
@Composable
fun Tablayout(){

    var selecteditem by remember {
        mutableIntStateOf(0)
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        ScrollableTabRow  (
            selectedTabIndex = selecteditem,
            modifier = Modifier.fillMaxWidth().height(50.dp),

        ) {
            tabitems.forEachIndexed { index, tabitem ->

                Tab(
                    modifier = Modifier.height(50.dp).fillMaxWidth(),
                    selected = index == selecteditem,
                    onClick = {
                        selecteditem =index
                    }
                ) {
                    tabSelector(tabitem.title)


                }
            }
        }


    }


    
}

@Composable
fun tabSelector(text:String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().fillMaxHeight()


    )  {
        Text(text =text, )
        Tabchip(modifier =  Modifier
            .height(17.dp)
            .width(35.dp).padding(start = 3.dp).weight(1f,fill = false)
        )
    }
}


@PreviewAndLightDark
@Composable
fun previewTab(){

    ShippingAppTheme{
            Tablayout()

    }


}