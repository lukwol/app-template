package io.github.lukwol.app.android.preview.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.lukwol.app.android.preview.PreviewEnvironment
import io.github.lukwol.app.screen.ThirdScreen

@Preview(showBackground = true)
@Composable
private fun ThirdScreenPreview() = PreviewEnvironment {
    ThirdScreen(listOf("Adam", "Anna"))
}
