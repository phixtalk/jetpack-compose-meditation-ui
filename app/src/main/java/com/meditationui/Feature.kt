package com.meditationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.meditationui.ui.theme.*

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)

object FeatureData{
    fun load(): List<Feature>{
        return listOf(
            Feature(
                title = "Sleep meditation",
                R.drawable.ic_headphone,
                BlueViolet1,
                BlueViolet2,
                BlueViolet3
            ),
            Feature(
                title = "Tips for sleeping",
                R.drawable.ic_videocam,
                LightGreen1,
                LightGreen2,
                LightGreen3
            ),
            Feature(
                title = "Night island",
                R.drawable.ic_headphone,
                OrangeYellow1,
                OrangeYellow2,
                OrangeYellow3
            ),
            Feature(
                title = "Calming sounds",
                R.drawable.ic_headphone,
                Beige1,
                Beige2,
                Beige3
            )
        )
    }
}
