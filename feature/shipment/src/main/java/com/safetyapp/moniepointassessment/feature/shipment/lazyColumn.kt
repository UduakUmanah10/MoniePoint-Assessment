package com.safetyapp.moniepointassessment.feature.shipment


import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.theme.ShippingAppTheme


data class lazydata(
    @DrawableRes val icon:Int,
    val  state:String
)

val data :List<lazydata> = listOf(
    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.loading,
        "loading"
    ),
    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.pending,
        "pending"
    ),
    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.inprogress,
        "in-progress"
    ),

    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.loading,
        "loading"
    ),
    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.pending,
        "pending"
    ),
    lazydata(
        com.safetyapp.moniepointassessment.core.view.R.drawable.inprogress,
        "in-progress"
    ),


    )

@Composable
fun colorSelextor(input:String):Color{
    return when(input){
        "loading" -> ShippingAppTheme.colorScheme.tertiaryContainer
        "pending" -> ShippingAppTheme.colorScheme.onTertiary
        else -> ShippingAppTheme.colorScheme.tertiary

    }
}


@Composable
fun lazyColumn(){
    LazyColumn(contentPadding = PaddingValues( 7.dp),
        modifier = Modifier
            .background(ShippingAppTheme
                .colorScheme.onSecondary
            )) {

        // Add 5 items
        items(data.size) { index ->
            lazyColumContent(
                icon = data[index].icon,
                text = data[index].state,
                tint = colorSelextor(data[index].state),
                textColor = colorSelextor(data[index].state),
                surfaceColor = ShippingAppTheme.colorScheme.onSecondary

            )
        }

    }
}



@PreviewAndLightDark
@Composable
fun PreviewLazyColumn(){

    ShippingAppTheme{

        lazyColumn()
    }

}