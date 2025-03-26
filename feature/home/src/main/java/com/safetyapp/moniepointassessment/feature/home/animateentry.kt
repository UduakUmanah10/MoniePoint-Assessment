package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import kotlinx.coroutines.delay

@Composable
fun AnimatedBoxEntryVertically(
    composable: @Composable () -> Unit = {}
) {
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(500L)
        isVisible = true
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(initialOffsetY = { it }) + fadeIn(), // Enter from bottom
    ) {
        composable()
    }
}

@Composable
fun AnimatedEntryHorizontally(
    composable: @Composable () -> Unit = {}
) {
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(530L) // Optional delay before animation starts
        isVisible = true
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInHorizontally(initialOffsetX = { it }) + fadeIn(), // Start from right
    ) {
        composable()
    }
}
@Composable
fun AnimatedSlideUpDown(
    composable: @Composable () -> Unit = {}
) {
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(500L) // Optional delay before animation starts
        isVisible = true
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(initialOffsetY = { -it }) + fadeIn(), // Enter from top
        exit = slideOutVertically(targetOffsetY = { -it }) + fadeOut()
    ) {
        composable()


    }
}

@Preview
@Composable
fun PreviewAnimatedBoxSlideUpDown() {
    AnimatedBoxEntryVertically{
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue)
        )
    }
}

//
//@PreviewAndLightDark
//@Composable
//fun PreviewAnimatedBoxEntry() {
//    AnimatedEntryHorizontally(){
//        Box(
//            modifier = Modifier
//                .size(50.dp)
//                .background(Color.Blue)
//        )
//    }
//}