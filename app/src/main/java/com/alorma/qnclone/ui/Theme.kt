package com.alorma.qnclone.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val BlueDarkColorPalette = darkColors(
    primary = blue,
    primaryVariant = blueVibrant,
    secondary = Color.Black,
)

private val BlueLightColorPalette = lightColors(
    primary = blue,
    primaryVariant = blueVibrant,
    secondary = Color.Black
)

private val GreenDarkColorPalette = darkColors(
    primary = green,
    primaryVariant = greenVibrant,
    secondary = Color.Black,
)

private val GreenLightColorPalette = lightColors(
    primary = green,
    primaryVariant = greenVibrant,
    secondary = Color.Black
)

private val YellowDarkColorPalette = darkColors(
    primary = yellow,
    primaryVariant = yellow,
    secondary = Color.Black,
)

private val YellowLightColorPalette = lightColors(
    primary = yellow,
    primaryVariant = yellow,
    secondary = Color.Black
)

private val RedDarkColorPalette = darkColors(
    primary = red,
    primaryVariant = red,
    secondary = Color.Black,
)

private val RedLightColorPalette = lightColors(
    primary = red,
    primaryVariant = red,
    secondary = Color.Black
)

@Composable
fun QNInfoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        BlueDarkColorPalette
    } else {
        BlueLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun QNAchivementsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        GreenDarkColorPalette
    } else {
        GreenLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun QNCommunityTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        YellowDarkColorPalette
    } else {
        YellowLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun QNHealthTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        RedDarkColorPalette
    } else {
        RedLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}