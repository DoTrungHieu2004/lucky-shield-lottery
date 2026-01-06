package com.lotto.luckyshield.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = MidnightBlue,
    secondary = Gold,
    tertiary = Emerald,
    error = Crimson,

    background = DarkBackground,
    surface = DarkSurface,

    onPrimary = LightText,
    onSecondary = MidnightBlue,
    onBackground = LightText,
    onSurface = LightText,
    onError = LightText
)

@Composable
fun LuckyShieldTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = LuckyTypography,
        content = content
    )
}