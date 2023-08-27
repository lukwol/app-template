package io.github.lukwol.presentation.screen.third

import kotlinx.serialization.Serializable

@Serializable
data class ThirdScreenArgs(
    val firstText: String,
    val secondText: String,
)
