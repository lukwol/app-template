package io.github.lukwol.app.ios.launcher

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.ComposeUIViewController
import io.github.lukwol.data.dependency.DataModule
import io.github.lukwol.domain.dependency.DomainModule
import io.github.lukwol.presentation.dependency.PresentationModule
import io.github.lukwol.presentation.navigation.AppScreensNavigation
import org.koin.compose.KoinApplication
import org.koin.core.logger.Level

@Suppress("FunctionName", "unused")
fun MainViewController() =
    ComposeUIViewController {
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
                AppScreensNavigation()
            }
        }
    }
