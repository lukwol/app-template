package io.github.lukwol.app.desktop.preview.screen.third

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import io.github.lukwol.app.desktop.preview.PreviewEnvironment
import io.github.lukwol.presentation.dependency.koinViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel

@Preview
@Composable
private fun ThirdScreenPreview() =
    PreviewEnvironment {
        ThirdScreen(
            viewModel =
                koinViewModel<ThirdScreenViewModel>()
                    .apply { texts = listOf("Adam", "Anna") },
        )
    }
