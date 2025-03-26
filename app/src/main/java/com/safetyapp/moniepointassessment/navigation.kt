package com.safetyapp.moniepointassessment

import androidx.compose.runtime.*
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.feature.calculate.Calculate
import com.safetyapp.moniepointassessment.feature.calculate.EstimateRoute
import com.safetyapp.moniepointassessment.feature.calculate.NavigatetoCalculateScreen
import com.safetyapp.moniepointassessment.feature.calculate.calculateScreenComp
import com.safetyapp.moniepointassessment.feature.shipment.ShipMentRoutes
import com.safetyapp.moniepointassessment.feature.shipment.shipmsntScreen

import com.safetyapp.moniepointassessment.feature.calculate.estimateScreen
import com.safetyapp.moniepointassessment.feature.calculate.navigateToestimate
import com.safetyapp.moniepointassessment.feature.home.HomeRoute
import com.safetyapp.moniepointassessment.feature.home.homeScreen
import com.safetyapp.moniepointassessment.feature.home.homeScreenComposable
import com.safetyapp.moniepointassessment.feature.home.navigatetoHome
import com.safetyapp.moniepointassessment.feature.shipment.navigateToShipments
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun HomeScreen(

) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            HomeBottomBar(
                onCalculateClicked = {navController.NavigatetoCalculateScreen()},
                onHomeClicked = {navController.navigatetoHome()},
                onShipmentClicKed = {navController.navigateToShipments()},
                hierarchy = navController.currentBackStackEntryAsState().value?.destination?.hierarchy,

            )
        }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            startDestination = HomeRoute
        ) {
            shipmsntScreen(
            onleadingIconClicked ={navController.navigatetoHome()}
            )
            estimateScreen(
                backtoHome ={navController.navigatetoHome()}
            )
            homeScreenComposable()

            calculateScreenComp(
                onBackIconCLicked ={navController.navigatetoHome()},
               onCalculateClicked ={navController.navigateToestimate()}
            )

        }
    }
}


@Composable
private fun HomeBottomBar(
    hierarchy: Sequence<NavDestination>?,
    onCalculateClicked:()->Unit={},
    onHomeClicked:()->Unit={},
    onShipmentClicKed:()->Unit={}

) {
    var showBottomBar by remember { mutableStateOf(true) }

    LaunchedEffect(hierarchy) {
        showBottomBar = when {
            hierarchy?.any {
                it.hasRoute(ShipMentRoutes::class) || it.hasRoute(Calculate::class)
            } == true -> false
            else -> true
        }
    }


    AnimatedVisibility(
        visible = showBottomBar,
        enter = slideInVertically { it }, // Enters by scrolling up
        exit = slideOutVertically { it }  // Exits by scrolling down
    ) {
        NavigationBar(  windowInsets = NavigationBarDefaults.windowInsets ) {
            NavigationBarItem(
                label = {Text("Home")},
                selected = hierarchy?.any { it.hasRoute(HomeRoute::class) } == true,
                icon = { Icon(painter =
                    painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.home_24px),
                    contentDescription = "Third Screen")
                },
                onClick = onHomeClicked
            )
            NavigationBarItem(
                label = {Text("Calculate")},
               selected = hierarchy?.any { it.hasRoute(Calculate::class) } == true,
                icon = { Icon(painter =
                    painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.calculate),
                    contentDescription = "Third Screen")
                },
                onClick = onCalculateClicked
            )


            NavigationBarItem(
                label = {Text("Shipment")},
                selected = hierarchy?.any { it.hasRoute(ShipMentRoutes::class) } == true,
                icon = { Icon(painter =
                    painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.pending),
                    contentDescription = "Third Screen")
                       },
                onClick = onShipmentClicKed
            )
            NavigationBarItem(
                label = {Text("Profile")},
                selected = hierarchy?.any { it.hasRoute(EstimateRoute::class) } == true,
                icon = { Icon(painter =
                    painterResource(id = com.safetyapp.moniepointassessment.core.view.R.drawable.profile),
                    contentDescription = "Third Screen")
                },
                onClick = {}
            )
        }
    }
}


@PreviewAndLightDark
@Composable
fun pre (){
 ShippingAppTheme {
      HomeScreen()
 }
}
