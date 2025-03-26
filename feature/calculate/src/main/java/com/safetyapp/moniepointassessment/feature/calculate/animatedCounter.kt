package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.time.format.TextStyle


import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme
import kotlinx.coroutines.delay


@Composable
fun AnimatedCounter(
    count: Int,
    modifier: Modifier = Modifier,
) {
    var oldCount by remember {
        mutableStateOf(count)
    }
    SideEffect {
        oldCount = count
    }
    Row(modifier = modifier) {
        val countString = count.toString()
        val oldCountString = oldCount.toString()
        for(i in countString.indices) {
            val oldChar = oldCountString.getOrNull(i)
            val newChar = countString[i]
            val char = if(oldChar == newChar) {
                oldCountString[i]
            } else {
                countString[i]
            }
            AnimatedContent(
                targetState = char,
                transitionSpec = {
                    slideInVertically { it } togetherWith  slideOutVertically { -it }
                }
            ) { char ->

                Column {
                    Text(
                        text = char.toString(),
                        style = ShippingAppTheme.typography.bodyLarge,
                        softWrap = false,
                        fontWeight = FontWeight.W500, fontSize = 30.sp,
                        color = Color.Green
                    )



                }


            }
        }
    }
}



@Composable
fun AnimatedCounterScreen() {
    var count by remember { mutableStateOf(4215) }

    // Automatically increment count 5 times with a delay
    LaunchedEffect(Unit) {
        repeat(5) {
            delay(100L) // 1-second delay between increments
            count++
        }
    }

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedCounter(
            count = count,

        )
    }
}

@Composable
fun AnimatedBoxEntry(
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


@PreviewAndLightDark
@Composable
fun privew(){
    ShippingAppTheme {
        AnimatedBoxEntry(){
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(Color.Blue)
            )
        }
    }
}