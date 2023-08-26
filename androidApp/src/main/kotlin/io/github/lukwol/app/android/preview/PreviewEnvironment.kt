package io.github.lukwol.app.android.preview

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun PreviewEnvironment(
    content: @Composable () -> Unit,
) {
    MaterialTheme(content = content)
}
