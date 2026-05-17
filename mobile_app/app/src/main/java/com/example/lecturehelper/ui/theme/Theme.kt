package com.example.lecturehelper.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(

    primary = PrimaryBlue,

    secondary = SecondaryBlue,

    background = BackgroundLight,

    surface = SurfaceWhite,

    error = ErrorRed
)

private val DarkColors = darkColorScheme(

    primary = SecondaryBlue,

    secondary = PrimaryBlue
)

@Composable
fun lecturehelperTheme(

    darkTheme: Boolean = false,

    content: @Composable () -> Unit
) {

    val colors = if (darkTheme) {

        DarkColors

    } else {

        LightColors
    }

    MaterialTheme(

        colorScheme = colors,

        typography = Typography,

        content = content
    )
}