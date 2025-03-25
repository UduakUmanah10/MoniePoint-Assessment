package com.safetyapp.moniepointassessment

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable


@Composable
fun AppRoot(){

    val navController= rememberNavController()
    NavHost(
        navController =navController,
        startDestination =  FirstScreen
    ){
        FirstScreen(onclick = {navController.navigateToSecond()})
        SecondScreen(onclick = { navController.navigateToThird()})
        ThirdScreen(onclick = { navController.navigateToFirst()})

    }
}



@Serializable
data object HomeDestination

