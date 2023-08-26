package io.github.lukwol.app.desktop.preview.screen

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.app.screen.ThirdScreen

@Preview
@Composable
private fun ThirdScreenPreview() = PreviewEnvironment {
    ThirdScreen(listOf("Adam", "Anna"))
}
