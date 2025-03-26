package com.safetyapp.moniepointassessment.feature.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable


@Serializable
data object HomeRoute


fun NavGraphBuilder.homeScreenComposable() {
   composable<HomeRoute>{
       homeScreen()
   }

}


fun NavController.navigatetoHome(){
    navigate(HomeRoute)
}