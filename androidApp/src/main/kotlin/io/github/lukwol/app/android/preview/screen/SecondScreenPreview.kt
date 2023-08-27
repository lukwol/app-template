package io.github.lukwol.app.android.preview.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.lukwol.app.android.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel

@Preview(showBackground = true)
@Composable
private fun SecondScreenPreview() = PreviewEnvironment {
    SecondScreen(
        viewModel = SecondScreenViewModel().apply { firstText = "Adam" },
    )
}
