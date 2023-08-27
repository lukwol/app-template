package io.github.lukwol.app.android.preview.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.lukwol.app.android.preview.PreviewEnvironment
import io.github.lukwol.presentation.screen.FirstScreen

@Preview(showBackground = true)
@Composable
private fun FirstScreenPreview() = PreviewEnvironment {
    FirstScreen()
}
