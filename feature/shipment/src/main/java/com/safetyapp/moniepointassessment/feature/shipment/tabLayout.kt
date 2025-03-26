package com.safetyapp.moniepointassessment.feature.shipment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.CustomCenteredTopAppBar
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme
import kotlinx.coroutines.launch


data class Tabitem(
    val title: String
)

val tabitems = listOf<Tabitem>(
    Tabitem("All"),
    Tabitem("Pending order"),
    Tabitem("in Progress"),
    Tabitem("Pending"),

    )

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tablayout(onLeadingIconClicked:()->Unit ={}) {

    var selecteditem by remember {
        mutableIntStateOf(0)
    }

    val pageState = rememberPagerState(pageCount = { tabitems.size })
    val coroutineScope = rememberCoroutineScope()

    Column(
        Modifier.fillMaxSize(),
    ) {


        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        CustomCenteredTopAppBar(
            scrollBehavior =scrollBehavior,
            centeredText =  stringResource(R.string.shipment_hitory),
            leadingICon = R.drawable.backwardsarrow,
            iconColor = ShippingAppTheme.colorScheme.background,
            onLeadingIconClicked = onLeadingIconClicked,
            titleContentColor = ShippingAppTheme.colorScheme.background,
            containerColor = ShippingAppTheme.colorScheme.primary

        )

        Box(){
            ScrollableTabRow(
                selectedTabIndex = pageState.currentPage,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                edgePadding = 10.dp,

                containerColor = ShippingAppTheme.colorScheme.primary,
                divider = {},
                indicator = { tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier.tabIndicatorOffset(tabPositions[selecteditem]),
                        color = ShippingAppTheme.colorScheme.background,
                        height = 2.dp

                    )
                }


            ) {
                tabitems.forEachIndexed { index, tabitem ->
                    Tab(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxWidth(),
                        selected = pageState.currentPage == index,
                        onClick = {
                            selecteditem = index
                            coroutineScope.launch {
                                pageState.animateScrollToPage(index)
                            }
                        }
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                text = tabitem.title,
                                modifier = Modifier.padding(8.dp),
                                color =
                                    if (selecteditem == index) ShippingAppTheme.colorScheme.background
                                    else ShippingAppTheme.colorScheme.inverseSurface
                            )
                            Tabchip(
                                textColor =
                                    if (selecteditem == index) ShippingAppTheme.colorScheme.background
                                    else ShippingAppTheme.colorScheme.inverseSurface,

                                color =
                                    if (selecteditem == index) ShippingAppTheme.colorScheme.onPrimary
                                    else ShippingAppTheme.colorScheme.onTertiaryContainer
                            )
                        }


                    }
                }
            }


        }
        

        HorizontalPager(state = pageState, userScrollEnabled = false) { index ->


            lazyColumn()


        }


    }


}

@Composable
fun tabSelector(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()


    ) {
        Text(text = text)
        Tabchip(
            modifier = Modifier
                .height(17.dp)
                .width(35.dp)
                .padding(start = 3.dp)
                .weight(1f, fill = false)
        )
    }
}


@PreviewAndLightDark
@Composable
fun previewTab() {

    ShippingAppTheme {
        Tablayout()

    }


}