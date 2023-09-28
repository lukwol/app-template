package io.github.lukwol.app.desktop

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.application
import io.github.lukwol.data.dependency.DataModule
import io.github.lukwol.domain.dependency.DomainModule
import io.github.lukwol.presentation.dependency.PresentationModule
import io.github.lukwol.presentation.navigation.AppWindowsNavigation
import org.koin.compose.KoinApplication
import org.koin.core.logger.Level

fun main() {
    application {
        KoinApplication(
            application = {
                printLogger(Level.INFO)
                modules(
                    DataModule,
                    DomainModule,
                    PresentationModule,
                )
            },
        ) {
            MaterialTheme {
                AppWindowsNavigation()
            }
        }
    }
}
