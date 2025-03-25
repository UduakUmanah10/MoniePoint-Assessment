package com.safetyapp.moniepointassessment.ui.theme

import android.view.WindowInsets
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.FirstScreen
import com.safetyapp.moniepointassessment.SecondScreen
import com.safetyapp.moniepointassessment.navigateToSecond
import com.safetyapp.moniepointassessment.navigateToThird
import com.safetyapp.theme.ShippingAppTheme


typealias DELAY = Int
const val ANIMATION_DELAY: DELAY = 1200
const val VERTICAL_EXPANSION: DELAY = 20

sealed class NavigationDestination(val name: String, @DrawableRes val icons: Int, val route: String) {

    object Home : NavigationDestination("Home ", icons = com.safetyapp.moniepointassessment.core.view.R.drawable.home_24px, "Home")
    object Tasks : NavigationDestination("Tasks", icons = com.safetyapp.moniepointassessment.core.view.R.drawable.calculate, "Calculate")
    object Insights : NavigationDestination("Insights", icons = com.safetyapp.moniepointassessment.core.view.R.drawable.pending, "Shipment")
    object Settings : NavigationDestination("Settings", icons = com.safetyapp.moniepointassessment.core.view.R.drawable.profile, "Profile")
}

val NavigationDestinationItems = arrayListOf(
    NavigationDestination.Home,
    NavigationDestination.Tasks,
    NavigationDestination.Insights,
    NavigationDestination.Settings,
)


@Composable
fun HomeScreen(
    destinations: ArrayList<NavigationDestination> = NavigationDestinationItems,
    onAddButtonClicked: () -> Unit,
) {
    val navController = rememberNavController()
    Scaffold(

        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),

        bottomBar = {
            val backStackEntry by navController.currentBackStackEntryAsState()
            var showBottomBar by remember { mutableStateOf(true) }
            showBottomBar = when (backStackEntry?.destination?.route) {
                "TaskScreen" -> false
                "InsightScreen" -> false
                else -> true
            }

            AnimatedVisibility(
                showBottomBar,
                enter = expandVertically(expandFrom = Alignment.Top) { VERTICAL_EXPANSION },
                exit = shrinkVertically(
                    animationSpec = tween(ANIMATION_DELAY),

                    ) { fullHeight ->
                    fullHeight / 2
                },

                ) {
                NavigationBar(
                    modifier = Modifier.background(ShippingAppTheme.colorScheme.onBackground),
                    windowInsets = NavigationBarDefaults.windowInsets,
                    tonalElevation = 1.dp,
                    containerColor = Color.Red,

                    ) {
                    destinations.forEach { content ->

                      //  NavigationBarItem1(backStackEntry, content, navController)
                    }

//
                }
            }
        },
        content = { padding ->

            NavHost(
                navController = navController,
                startDestination = FirstScreen,
                modifier = Modifier.padding(padding)
            ) {

                FirstScreen(onclick = {navController.navigateToSecond()})
                SecondScreen(onclick = { navController.navigateToThird()})


            }
        },

        )
}


@PreviewAndLightDark
@Composable
fun SignupPreview() {
    ShippingAppTheme {
        HomeScreen(
            NavigationDestinationItems,
            {},
        )
    }
}
