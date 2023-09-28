package io.github.lukwol.app.desktop

import androidx.compose.ui.window.application
import io.github.lukwol.app.App
import io.github.lukwol.app.initialSetup
import io.github.lukwol.navigation.windows.WindowsNavigation
import org.koin.compose.KoinContext

fun main() {
    initialSetup()

    application {
        WindowsNavigation(
            startRoute = WindowRoutes.MainWindowRoute,
        ) {
            window(WindowRoutes.MainWindowRoute) {
                KoinContext {
                    App()
                }
            }
        }
    }
}
