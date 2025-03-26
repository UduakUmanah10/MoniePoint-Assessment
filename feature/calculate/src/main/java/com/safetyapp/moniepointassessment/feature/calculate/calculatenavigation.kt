package com.safetyapp.moniepointassessment.feature.calculate

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable


@Serializable
data object Calculate



fun NavGraphBuilder.calculateScreenComp(
    onBackIconCLicked: () -> Unit ={},
    onCalculateClicked: () -> Unit ={}
){

    composable<Calculate>{

        CalculateScreen(
            onBackIconCLicked= onBackIconCLicked,
            onCalculateClicked = onCalculateClicked
        )


    }


}


fun NavController.NavigatetoCalculateScreen(){
    navigate(Calculate)
}