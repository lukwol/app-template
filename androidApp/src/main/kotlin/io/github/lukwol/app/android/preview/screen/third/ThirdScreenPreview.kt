package io.github.lukwol.app.android.preview.screen.third

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.lukwol.app.android.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel
import org.koin.androidx.compose.koinViewModel

@Preview(showBackground = true)
@Composable
private fun ThirdScreenPreview() = PreviewEnvironment {
    ThirdScreen(
        viewModel = koinViewModel<ThirdScreenViewModel>()
            .apply { texts = listOf("Adam", "Anna") },
    )
}
