package com.safetyapp.moniepointassessment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable


@Serializable
data object FirstScreen


@Serializable
data object SecondScreen


@Serializable
data object ThirdScreen

@Composable
fun firstScreen(onClick : ()-> Unit){

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Button(onClick = onClick) {
            Text("firstScreen")
        }
    }


}


fun NavGraphBuilder.FirstScreen( onclick:()-> Unit = {}){
    composable<FirstScreen> {
        firstScreen(onClick =onclick)
    }
}


fun NavController.navigateToFirst(){
    navigate(FirstScreen)
}

@Composable
fun secondScreen(onClick : ()-> Unit){
    Button(onClick = onClick) {
        Text("second")
    }
}

fun NavGraphBuilder.SecondScreen( onclick:()-> Unit = {}){
    composable<SecondScreen> {
        secondScreen(onClick = onclick)
    }
}

fun NavController.navigateToSecond(){
    navigate(SecondScreen)
}


@Composable
fun thirdScreen(onClick : ()-> Unit){
    Button(onClick = onClick) {
        Text("third")
    }
}

fun NavGraphBuilder.ThirdScreen( onclick:()-> Unit = {}){
    composable<ThirdScreen> {
        thirdScreen(onClick  =onclick)
    }
}
fun NavController.navigateToThird(){
    navigate(ThirdScreen)
}