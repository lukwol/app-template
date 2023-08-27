package io.github.lukwol.app.desktop.preview.screen

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel

@Preview
@Composable
private fun SecondScreenPreview() = PreviewEnvironment {
    SecondScreen(
        viewModel = SecondScreenViewModel().apply { firstText = "Adam" },
    )
}
