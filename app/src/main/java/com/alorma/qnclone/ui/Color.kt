package com.alorma.qnclone.ui

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val blue = Color(0XFF1E88E5)
val blueVibrant = Color(0XFF1976D2)
val green = Color(0xFF66BB6A)
val greenVibrant = Color(0xFF388E3C)
val red = Color(0xFFE53935)
val yellow = Color(0xFFFDD835)


/**
 * primarySurface represents the background color of components that are [Colors.primary]
 * in light theme, and [Colors.surface] in dark theme, such as [androidx.compose.material.TabRow]
 * and [androidx.compose.material.TopAppBar]. This is to reduce brightness of large surfaces in dark
 * theme, aiding contrast and readability. See
 * [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [Colors.primary] if in light theme, else [Colors.surface]
 */
val Colors.onPrimarySurface: Color get() = if (isLight) onPrimary else primary