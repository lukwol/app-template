package io.github.lukwol.app.preview.screen.first

import androidx.compose.runtime.Composable
import io.github.lukwol.app.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.first.FirstScreen
import io.github.lukwol.presentation.screen.first.FirstScreenViewModel

@Composable
fun FirstScreenPreviewContent() = PreviewEnvironment {
    FirstScreen(
        viewModel = FirstScreenViewModel().apply { text = "Mark" },
    )
}
