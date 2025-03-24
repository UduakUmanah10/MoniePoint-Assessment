package com.safetyapp.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.safetyapp.moniepointassessment.core.view.R
import com.safetyapp.theme.ShippingAppTheme


@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    text: String,
    onTextChanged: (String) -> Unit,
    labelText: String,
    placeholderText: String = "",
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = {},
    visualTransformation: VisualTransformation = VisualTransformation.None,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Email,
        imeAction = ImeAction.Done
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    shape: Shape = OutlinedTextFieldDefaults.shape,
    singleLine: Boolean = true,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = ShippingAppTheme.colorScheme.primary,
        unfocusedBorderColor = Color.Yellow,
        disabledBorderColor = Color.Blue,
        disabledTextColor = Color.Blue,
        disabledSupportingTextColor = Color.Blue,
        unfocusedContainerColor = Color.Transparent


    ),
    isError: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    showTrailingIcon: Boolean = true,
    supportingText: @Composable (() -> Unit)? = null,
    testTag:String = ""

) {

    Column(modifier = modifier) {

        OutlinedTextField(
            modifier = modifier.wrapContentHeight().fillMaxWidth().testTag(testTag),
            value = text,
            onValueChange = onTextChanged,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = LocalTextStyle.current,
            label = null ,//{ Text(labelText) },
            placeholder = { Text(placeholderText) },
            leadingIcon = leadingIcon,
            trailingIcon =  if (showTrailingIcon) trailingIcon else null,
            isError =  isError,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            shape = shape,
            colors = colors,
            supportingText = supportingText
        )

    }
}


@PreviewLightDark
@Composable
fun CustomTextFieldPreview() {
    ShippingAppTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            CustomTextField(
                text = "",
                onTextChanged = {},
                labelText = "",
                placeholderText = "Sender Location",
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
                text = "",
                onTextChanged = {},
                labelText = "Email",
                placeholderText = "email@example.com",
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
                text = "",
                onTextChanged = {},
                labelText = "",
                placeholderText = "Sender Location",
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