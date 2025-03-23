package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.CustomTextField
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun multipleTextInput(
    firstInputText: String = "",
    secondTextInput:String ="",
    thirdTextInput:String ="",
    secondInputPlaceholderText: String = stringResource(R.string.Receiver_Location),
    firstInputPlaceholderText: String = stringResource(R.string.Sender_Location),
    thirdInputPlaceHolderText: String = stringResource(R.string.Approx_Weight),
) {


    Surface(
        modifier = Modifier.padding(12.dp).fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.Red
    ) {


        Column(
            modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            CustomTextField(
                text = firstInputText,
                onTextChanged = {},
                labelText = "",
                placeholderText = firstInputPlaceholderText,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.loading),
                        contentDescription = "",
                        tint = ShippingAppTheme.colorScheme.error,
                        modifier = Modifier.size(30.dp),
                    )
                },
                shape = ShippingAppTheme.shape.TextfieldShape,
                showTrailingIcon = false,
            )
            CustomTextField(
                text = secondTextInput,
                onTextChanged = {},
                labelText = "",
                placeholderText = secondInputPlaceholderText,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.loading),
                        contentDescription = "",
                        tint = ShippingAppTheme.colorScheme.error,
                        modifier = Modifier.size(30.dp),
                    )
                },
                shape = ShippingAppTheme.shape.TextfieldShape,
                showTrailingIcon = false,
            )
            CustomTextField(
                text = thirdTextInput,
                onTextChanged = {},
                labelText = "",
                placeholderText = thirdInputPlaceHolderText,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.loading),
                        contentDescription = "",
                        tint = ShippingAppTheme.colorScheme.error,
                        modifier = Modifier.size(30.dp),
                    )
                },
                shape = ShippingAppTheme.shape.TextfieldShape,
                showTrailingIcon = false,
            )

        }

    }


}

@PreviewAndLightDark
@Composable
fun multipletextPreview() {

    ShippingAppTheme {
        multipleTextInput()

    }

}