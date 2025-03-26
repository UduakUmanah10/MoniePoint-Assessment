package com.safetyapp.moniepointassessment.feature.shipment

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable


@Serializable
data object ShipMentRoutes


fun NavGraphBuilder.shipmsntScreen(
    onleadingIconClicked:()->Unit ={}
){
    composable<ShipMentRoutes>
    {
        Tablayout(onLeadingIconClicked = onleadingIconClicked)

    }

}

fun NavController.navigateToShipments(){

    navigate(route = ShipMentRoutes)

}