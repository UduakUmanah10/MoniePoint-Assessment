package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun filterChip(
    text: String,
    selected: Boolean,
    onClick: () -> Unit = {}
) {


    FilterChip(
        modifier = Modifier.padding(5.dp).height(40.dp),
        selected = selected,
        onClick = onClick,
        label = { Text(text = text) },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = ShippingAppTheme.colorScheme.secondaryContainer,
            selectedLabelColor = ShippingAppTheme.colorScheme.onSecondaryContainer

        ),
        leadingIcon = {
            if (selected) Icon(
                painter = painterResource(id = R.drawable.check),
                contentDescription = "",
                tint = ShippingAppTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier.size(20.dp),
            )
        }
    )


}

val list: List<String> = listOf(
    "Document",
    "Glass",
    "Liquid",
    "Food",
    "Electronic",
    "Product",
    "Others"

)


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun flowrow(
    list: List<String>,
    onOptionSelected: (String) -> Unit,
    selectedList: SnapshotStateList<String>
) {
    FlowRow(
        modifier = Modifier.padding(10.dp),
        maxItemsInEachRow = 4
    )
    {
        list.forEach {
            filterChip(
                text = it,
                onClick = { onOptionSelected(it) },
                selected = it in selectedList)

        }
    }
}

@PreviewAndLightDark
@Composable
fun previewfilterChip() {

    val selectedListItem = remember {
        mutableStateListOf(list[0])
    }
    Box(modifier = Modifier.fillMaxSize()) {
        flowrow(list, selectedList = selectedListItem, onOptionSelected = {
            if (it in selectedListItem) {
                selectedListItem.remove(it)
            } else selectedListItem.add(it)
        })
    }
}