package io.github.lukwol.app.android.preview.screen.second

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.lukwol.app.android.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import org.koin.androidx.compose.koinViewModel

@Preview(showBackground = true)
@Composable
private fun SecondScreenPreview() =
    PreviewEnvironment {
        SecondScreen(
            viewModel =
                koinViewModel<SecondScreenViewModel>()
                    .apply { firstText = "Adam" },
        )
    }
