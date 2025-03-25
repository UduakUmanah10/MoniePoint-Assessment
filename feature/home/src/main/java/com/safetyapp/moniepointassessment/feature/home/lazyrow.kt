package com.safetyapp.moniepointassessment.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme
import kotlinx.coroutines.delay

data class homeScreenItem(
    @DrawableRes val item: Int,
    val firstText: String,
    val Secondext: String
)

val itemlist = listOf<homeScreenItem>(

    homeScreenItem(
        item = com.safetyapp.moniepointassessment.core.view.R.drawable.ship,
        firstText = "Ocean freight",
        Secondext = "international"
    ),
    homeScreenItem(
        item = com.safetyapp.moniepointassessment.core.view.R.drawable.trailer,
        firstText = "Cargo freight",
        Secondext = "Reliable"
    ), homeScreenItem(
        item = com.safetyapp.moniepointassessment.core.view.R.drawable.ship,
        firstText = "Air freight",
        Secondext = "international"
    )
)

@Composable
fun lazyRowComposable(list:List<homeScreenItem> = itemlist) {

    val itemList = List(list.size) { it }
    var visibleItems by remember { mutableStateOf(emptySet<Int>()) }

    LaunchedEffect(Unit) {
        itemList.forEachIndexed { index, item ->
            delay(index * 200L) // Stagger animation for each item
            visibleItems = visibleItems + item
        }
    }

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(itemList.size) { index, ->
            AnimatedVisibility(
                visible = index in visibleItems,
                enter = slideInHorizontally(initialOffsetX = { 500 }) + fadeIn(),
                exit = fadeOut()
            ) {
                Box(
                    modifier = Modifier

                ) {
                    OceanFreightCard(
                      firstText =   list[index].firstText,
                        secondTExt = list[index].Secondext,
                        image = list[index].item

                    )
                }
            }
        }
    }
}


@PreviewAndLightDark
@Composable
fun previewLazyRow() {

    ShippingAppTheme {
        lazyRowComposable()
    }
}