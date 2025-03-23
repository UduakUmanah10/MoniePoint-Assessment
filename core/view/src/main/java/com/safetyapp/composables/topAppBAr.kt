package com.safetyapp.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.safetyapp.moniepointassessment.core.view.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomCenteredTopAppBar(
    modifier: Modifier =Modifier,
    scrollBehavior: TopAppBarScrollBehavior,
    centeredText:String,
    @DrawableRes leadingICon:Int,
    iconColor:Color,
    onLeadingIconClicked: ()->Unit,
    titleContentColor:Color,
    containerColor:Color,
    action: @Composable RowScope.()->Unit ={}
){

    CenterAlignedTopAppBar(
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = containerColor,
            titleContentColor = titleContentColor,
        ),

        title = {
            Text(
                text = centeredText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = onLeadingIconClicked ) {
                Icon(
                    painter = painterResource(leadingICon),
                    tint = iconColor,
                    modifier = Modifier.size(40.dp),
                    contentDescription = ""
                )
            }
        },

        actions = action,
        scrollBehavior = scrollBehavior,
    )


}


@OptIn(ExperimentalMaterial3Api::class)
@PreviewAndLightDark
@Composable fun PreviewTopAppBAr(){
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    CustomCenteredTopAppBar(
        scrollBehavior =scrollBehavior,
        centeredText =  stringResource(R.string.topAppbartext),
        leadingICon = R.drawable.backwardsarrow,
        iconColor = Color.Red,
        onLeadingIconClicked = {},
        titleContentColor = Color.Black,
        containerColor = Color.Green

    )

}