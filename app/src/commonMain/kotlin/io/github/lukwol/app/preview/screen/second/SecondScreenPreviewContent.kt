package io.github.lukwol.app.preview.screen.second

import androidx.compose.runtime.Composable
import io.github.lukwol.app.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel

@Composable
fun SecondScreenPreviewContent() = PreviewEnvironment {
    SecondScreen(
        viewModel = SecondScreenViewModel().apply { firstText = "Adam" },
    )
}
