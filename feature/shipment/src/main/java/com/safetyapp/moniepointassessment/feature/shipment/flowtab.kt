package com.safetyapp.moniepointassessment.feature.shipment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class TabItem(val title:String, val icon: ImageVector)
@Composable
fun TabView() {
    val tabs = listOf(
        TabItem("All", Icons.Filled.Home),
        TabItem("Favorites", Icons.Filled.Favorite),
        TabItem("in progress", Icons.Filled.Person),
        TabItem("Pending", Icons.Filled.Add)
    )
    var selectedTabIndex by remember { mutableStateOf(0) }
    Column {

        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            edgePadding = 16.dp,
            contentColor = Color.Gray,
            indicator = { tabPositions ->
                SecondaryIndicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                        .fillMaxWidth(),
                    color = Color.Black
                )
            }
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    modifier = Modifier.padding(8.dp),
                    content = {
                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {

                           // tabSelector(tab.title)

                            Text(
                                text = tab.title,
                                modifier = Modifier
                                    .padding(3.dp),
                                color = if (selectedTabIndex == index) Color.Black else Color.Gray
                            )
                           Tabchip()

//
                        }
                    }
                )
            }
        }
        when (selectedTabIndex) {
            0 -> {
                //Composible for tab
                Text("first ")
            }
            1 -> {
                //Composible for tab2
                Text("second")
            }
            2 -> {
                //Composible for tab3
                Text("third")
            }
            3 -> {
                //Composible for tab4
            }
        }
    }
}












@Preview
@Composable
fun previewpager(){
    TabView()
}