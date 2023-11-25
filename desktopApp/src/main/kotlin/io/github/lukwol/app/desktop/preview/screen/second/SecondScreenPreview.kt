package io.github.lukwol.app.desktop.preview.screen.second

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.presentation.dependency.koinViewModel
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel

@Preview
@Composable
private fun SecondScreenPreview() =
    PreviewEnvironment {
        SecondScreen(
            viewModel =
                koinViewModel<SecondScreenViewModel>()
                    .apply { firstText = "Adam" },
        )
    }
