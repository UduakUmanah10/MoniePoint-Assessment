package com.safetyapp.moniepointassessment.feature.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.safetyapp.composables.CustomTextField
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme

@Composable
fun searchText(
    text: String = "",
    placceholderText: String = "Enter a recipt number",
    surfaceBackgrounder: Color = Color.Red,
    surfaceShape: Shape = CircleShape,
    surfaceIconSize: Dp = 30.dp,
    surfaceIconColor: Color = Color.Black,
    contentDescription: String = "location",
    firstIconTint: Color = ShippingAppTheme.colorScheme.error
) {

    CustomTextField(
        text = text,
        onTextChanged = {},
        labelText = "",
        placeholderText = placceholderText,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = ShippingAppTheme.colorScheme.background,
            unfocusedBorderColor =ShippingAppTheme.colorScheme.background,
            disabledBorderColor = Color.Blue,
            disabledTextColor = Color.Blue,
            disabledSupportingTextColor = Color.Blue,
            unfocusedContainerColor = ShippingAppTheme.colorScheme.background,
            focusedContainerColor = ShippingAppTheme.colorScheme.background
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "",
                tint = firstIconTint,
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp),
            )
        },
        shape = RoundedCornerShape(30.dp),
        trailingIcon = {
            IconSurface(
                surfaceModifier = Modifier
                    .padding(5.dp)
                    .size(50.dp),
                surfaceBackgrounder = surfaceBackgrounder,
                surfaceShape = surfaceShape,
                surfaceIconSize = surfaceIconSize,
                surfaceIconColor = surfaceIconColor,
                contentDescription = contentDescription
            )
        }
    )

}


@PreviewLightDark
@Composable
fun previewSearchText() {

    ShippingAppTheme {
        searchText()

    }
}