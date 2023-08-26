package io.github.lukwol.app.desktop.preview

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun PreviewEnvironment(
    content: @Composable () -> Unit,
) {
    MaterialTheme(content = content)
}
