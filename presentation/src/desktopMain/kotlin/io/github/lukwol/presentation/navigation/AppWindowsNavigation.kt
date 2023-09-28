package io.github.lukwol.presentation.navigation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.windows.WindowsNavigation

@Composable
fun AppWindowsNavigation() {
    WindowsNavigation(
        startRoute = WindowRoutes.MainWindowRoute,
    ) {
        window(WindowRoutes.MainWindowRoute) {
            AppScreensNavigation()
        }
    }
}
