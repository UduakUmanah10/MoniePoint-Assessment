package com.safetyapp.moniepointassessment.feature.calculate

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable


@Serializable
data object  EstimateRoute


fun NavGraphBuilder.estimateScreen(
    backtoHome:() ->Unit ={}
){

    composable<EstimateRoute>{
      estimateScreen(
          backToHome = backtoHome

      )
    }
}



fun NavController.navigateToestimate(){
    navigate(route = EstimateRoute)
}