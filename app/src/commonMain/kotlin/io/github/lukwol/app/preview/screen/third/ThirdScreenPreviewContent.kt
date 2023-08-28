package io.github.lukwol.app.preview.screen.third

import androidx.compose.runtime.Composable
import io.github.lukwol.app.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel

@Composable
fun ThirdScreenPreviewContent() = PreviewEnvironment {
    ThirdScreen(
        viewModel = ThirdScreenViewModel().apply { texts = listOf("Adam", "Anna") },
    )
}
