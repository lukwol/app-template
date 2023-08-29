package io.github.lukwol.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.lukwol.presentation.AppNavigation

@Composable
fun App() {
    MaterialTheme {
        AppNavigation()
    }
}
