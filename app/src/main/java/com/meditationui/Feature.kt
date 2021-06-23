package com.meditationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val color: Color,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
