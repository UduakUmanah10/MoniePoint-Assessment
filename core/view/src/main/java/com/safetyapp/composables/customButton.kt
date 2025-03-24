package com.safetyapp.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.sp
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun customButton(
    modifier: Modifier,
    buttonText:String,
    onButtonClicked:()->Unit ={},
    buttonClor: ButtonColors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        containerColor = Color.Blue
    )
) {
    Button(
        modifier = modifier,
        onClick = onButtonClicked,
        colors = buttonClor
    ) {
        Text(buttonText, fontSize = 20.sp)
    }
}



@PreviewLightDark
@Composable
fun PreviewButtons(){
    ShippingAppTheme {
        customButton(modifier = Modifier.fillMaxWidth(), buttonText = "Calculate")

    }

}