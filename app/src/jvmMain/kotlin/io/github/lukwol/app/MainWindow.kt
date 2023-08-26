package io.github.lukwol.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.ApplicationScope
import androidx.compose.ui.window.Window

@Composable
fun ApplicationScope.MainWindow() {
    Window(
        onCloseRequest = ::exitApplication,
    ) {
        AppLauncher()
    }
}
