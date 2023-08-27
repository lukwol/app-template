package io.github.lukwol.app.desktop.preview.screen

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel

@Preview
@Composable
private fun ThirdScreenPreview() = PreviewEnvironment {
    ThirdScreen(
        viewModel = ThirdScreenViewModel().apply { texts = listOf("Adam", "Anna") },
    )
}
