package com.safetyapp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


private val light_primary = Color(0xFF493390)
private val light_background = Color(0xFFfffffe)
private val light_onPrimary = Color(0xFFe47929)
private val light_primaryContainer = Color(0xFFc9e6ff)
private val light_onPrimaryContainer = Color(0xFFc7c7c7)
private val light_secondary = Color(0xFF414145)
private val light_onSecondary = Color(0xFFf9f9f9)
private val light_secondaryContainer = Color(0xFF14212e)
private val light_onSecondaryContainer = Color(0xFFb2b8c5)
private val light_tertiary = Color(0xFF9ddec6)
private val light_onTertiary = Color(0xFFdcb392)
private val light_tertiaryContainer = Color(0xFF9ebad5)
private val light_onTertiaryContainer = Color(0xFF614ab4)
private val light_surface = Color(0xFF9a83ed)


private val light_error = Color(0xFFba1b1b)
private val light_errorContainer = Color(0xFFffdad4)
private val light_onError = Color(0xFFba1b1b)
private val light_onErrorContainer = Color(0xFF410001)
private val light_onBackground = Color(0xFF1a1c1e)

private val light_onSurface = Color(0xFF1a1c1e)
private val light_surfaceVariant = Color(0xFFdee3ea)
private val light_onSurfaceVariant = Color(0xFF41474d)
private val light_outline = Color(0xFF72787e)
private val light_inverseOnSurface = Color(0xFFcdc9c2)
private val light_inverseSurface = Color(0xFF2f3032)
private val light_ColorBar = Color(0xFFf4f4f2)

/////////////////////////////////////
private val dark_primary = Color(0xFF493390)
private val dark_background = Color(0xFFfffffe)
private val dark_onPrimary = Color(0xFFe47929)
private val dark_primaryContainer = Color(0xFF004b72)
private val dark_onPrimaryContainer = Color(0xFFc7c7c7)
private val dark_secondary = Color(0xFF414145)
private val dark_onSecondary = Color(0xFFf9f9f9)
private val dark_secondaryContainer = Color(0xFF14212e)
private val dark_onSecondaryContainer = Color(0xFFb2b8c5)
private val dark_tertiary = Color(0xFF9ddec6)
private val dark_onTertiary = Color(0xFFdcb392)
private val dark_tertiaryContainer = Color(0xFF9ebad5)
private val dark_onTertiaryContainer = Color(0xFF614ab4)
private val dark_surface = Color(0xFF9a83ed)

private val dark_error = Color(0xFFffb4a9)
private val dark_errorContainer = Color(0xFF930006)
private val dark_onError = Color(0xFF680003)
private val dark_onErrorContainer = Color(0xFFffdad4)
private val dark_onBackground = Color(0xFFe2e2e5)

private val dark_onSurface = Color(0xFFe2e2e5)
private val dark_surfaceVariant = Color(0xFF41474d)
private val dark_onSurfaceVariant = Color(0xFFc2c7ce)
private val dark_outline = Color(0xFF8b9198)
private val dark_inverseOnSurface = Color(0xFF1a1c1e)
private val dark_inverseSurface = Color(0xFFe2e2e5)
private val button_cardBackground = Color(0xFFe6f5fb)
private val dark_fontColor = Color(0xFFe8e9e9)
private val dark_ColorBar = Color(0xFFf4f4f2)

private val dark_backgroundColor = Color(0xff2b2b2a)
private val onboarding_buttonColor = Color(0xFF00308F)
private val seed = Color(0xFF0f3750)
private val error = Color(0xFFba1b1b)

private  val lightColorScheme = ShippingAppColorScheme(
    primary = light_primary,
    background = light_background,
    onPrimary = light_onPrimary,
    primaryContainer = light_primaryContainer,
    onPrimaryContainer = light_onPrimaryContainer,
    secondary = light_secondary,
    onSecondary = light_onSecondary,
    secondaryContainer = light_secondaryContainer,
    onSecondaryContainer = light_onSecondaryContainer,
    tertiary = light_tertiary,
    onTertiary = light_onTertiary,
    tertiaryContainer = light_tertiaryContainer,
    onTertiaryContainer = light_onTertiaryContainer,
    inverseSurface = light_surface,


    error = light_error,
    errorContainer = light_errorContainer,
    onError = light_onError,
    onErrorContainer = light_onErrorContainer,

    onBackground = light_onBackground,
    surface = light_surface,
    onSurface = light_onSurface,
    surfaceVariant = light_surfaceVariant,
    onSurfaceVariant = light_onSurfaceVariant,
    outline = light_outline,
    inverseOnSurface = light_inverseOnSurface,

    scrim = light_ColorBar,

    )


private val darkColorScheme = ShippingAppColorScheme(
    primary = dark_primary,
    background = dark_background,
    onPrimary = dark_onPrimary,
    onPrimaryContainer = dark_onPrimaryContainer,
    secondary = dark_secondary,
    onSecondary = dark_onSecondary,
    secondaryContainer = dark_secondaryContainer,
    onSecondaryContainer = dark_onSecondaryContainer,
    tertiary = dark_tertiary,
    onTertiary = dark_onTertiary,
    tertiaryContainer = dark_tertiaryContainer,
    onTertiaryContainer = dark_onTertiaryContainer,
    inverseSurface = dark_surface,




    primaryContainer = dark_primaryContainer,




    error = dark_onError,
    errorContainer = dark_errorContainer,
    onError = dark_onError,
    onErrorContainer = dark_onErrorContainer,

    onBackground = dark_backgroundColor,
    surface = dark_surface,
    onSurface = dark_onSurface,
    surfaceVariant = dark_surfaceVariant,
    onSurfaceVariant = dark_onSurfaceVariant,
    outline = dark_outline,
    inverseOnSurface = dark_inverseOnSurface,

    scrim = light_ColorBar,
)

private val typography =     ShippingAppAppTypography(
    displayLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,
    ),
    displayMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Thin,
        fontSize = 17.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineLarge = TextStyle(
     //  fontFamily = Roboto,
        fontWeight = FontWeight.W400,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineMedium = TextStyle(
//        fontFamily = Roboto,
        fontWeight = FontWeight.W400,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
    ),

    titleLarge = TextStyle(
//        fontFamily = Roboto,
        fontWeight = FontWeight.W400,
        fontSize = 23.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    ),
    titleMedium = TextStyle(
//        fontFamily = UrbanistMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.1.sp,
    ),
    titleSmall = TextStyle(
//        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    labelLarge = TextStyle(
//        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    bodyLarge = TextStyle(
//        fontFamily = Roboto,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),

)


private  val shape = ShippingAppAppShape(
    container = RoundedCornerShape(12.dp),
    button = RoundedCornerShape(50),
    TextfieldShape = RoundedCornerShape(15.dp)

)
private val size = ShippingAppAppSize(
    large =24.dp,
    medium =16.dp,
    normal =12.dp,
    small = 8.dp
)


@Composable
fun ShippingAppTheme(
    isDarkTheme:Boolean = isSystemInDarkTheme(),
    content : @Composable ()-> Unit
){
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
    CompositionLocalProvider(
        localShippingAppColorScheme provides colorScheme,
        localShippingAppTypography provides  typography ,
        localShippingAppShape provides shape,
        localShippingAppSize provides size ,
        content= content
    )
}

object ShippingAppTheme {
    val colorScheme: ShippingAppColorScheme @Composable get() = localShippingAppColorScheme.current
    val typography: ShippingAppAppTypography @Composable get() = localShippingAppTypography.current
    val size: ShippingAppAppSize @Composable get() = localShippingAppSize.current
    val shape: ShippingAppAppShape @Composable get() = localShippingAppShape.current
}
