package io.github.lukwol.app.desktop.preview.screen.first

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.presentation.dependency.koinViewModel
import io.github.lukwol.presentation.screen.first.FirstScreen
import io.github.lukwol.presentation.screen.first.FirstScreenViewModel

@Preview
@Composable
private fun FirstScreenPreview() = PreviewEnvironment {
    FirstScreen(
        viewModel = koinViewModel<FirstScreenViewModel>()
            .apply { text = "Mark" },
    )
}
