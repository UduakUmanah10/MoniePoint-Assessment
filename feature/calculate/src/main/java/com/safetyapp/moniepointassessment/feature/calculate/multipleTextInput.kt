package com.safetyapp.moniepointassessment.feature.calculate

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.CustomTextField
import com.safetyapp.composables.PreviewAndLightDark
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme

//ShippingAppTheme.colorScheme.onSecondary
@Composable
fun multipleTextInput(
    firstInputText: String = "",
    secondTextInput:String ="",
    thirdTextInput:String ="",
    onFirstTextChanged: (String) -> Unit = {},
    onSecondTextChanged: (String) -> Unit = {},
    onThirdTextChanged: (String) -> Unit = {},
    secondInputPlaceholderText: String = stringResource(R.string.Receiver_Location),
    firstInputPlaceholderText: String = stringResource(R.string.Sender_Location),
    thirdInputPlaceHolderText: String = stringResource(R.string.Approx_Weight),
) {


    Surface(
        modifier = Modifier.padding(12.dp).fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = ShippingAppTheme.colorScheme.background
    ) {


        Column(
            modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            CustomTextField(
                text = firstInputText,
                onTextChanged = onFirstTextChanged,
                labelText = "",
                placeholderText = firstInputPlaceholderText,
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.topbox),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(3.dp)
                            .size(30.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ShippingAppTheme.colorScheme.onSecondary,
                    unfocusedBorderColor =ShippingAppTheme.colorScheme.onSecondary,
                    disabledBorderColor = Color.Blue,
                    disabledTextColor = Color.Blue,
                    disabledSupportingTextColor = Color.Blue,
                    unfocusedContainerColor = ShippingAppTheme.colorScheme.onSecondary,
                    focusedContainerColor = ShippingAppTheme.colorScheme.onSecondary
                ),

                shape = ShippingAppTheme.shape.TextfieldShape,
                showTrailingIcon = false,
            )
            CustomTextField(
                text = secondTextInput,
                onTextChanged = onSecondTextChanged,
                labelText = "",
                placeholderText = secondInputPlaceholderText,
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.bottombox),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(3.dp)
                            .size(23.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ShippingAppTheme.colorScheme.onSecondary,
                    unfocusedBorderColor =ShippingAppTheme.colorScheme.onSecondary,
                    disabledBorderColor = Color.Blue,
                    disabledTextColor = Color.Blue,
                    disabledSupportingTextColor = Color.Blue,
                    unfocusedContainerColor = ShippingAppTheme.colorScheme.onSecondary,
                    focusedContainerColor = ShippingAppTheme.colorScheme.onSecondary
                ),
                shape = ShippingAppTheme.shape.TextfieldShape,
                showTrailingIcon = false,
            )
            CustomTextField(
                text = thirdTextInput,
                onTextChanged = onThirdTextChanged,
                labelText = "",
                placeholderText = thirdInputPlaceHolderText,
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.scale),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(3.dp)
                            .size(25.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ShippingAppTheme.colorScheme.onSecondary,
                    unfocusedBorderColor =ShippingAppTheme.colorScheme.onSecondary,
                    disabledBorderColor = Color.Blue,
                    disabledTextColor = Color.Blue,
                    disabledSupportingTextColor = Color.Blue,
                    unfocusedContainerColor = ShippingAppTheme.colorScheme.onSecondary,
                    focusedContainerColor = ShippingAppTheme.colorScheme.onSecondary
                ),
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