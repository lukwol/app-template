package io.github.lukwol.app.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import io.github.lukwol.data.dependency.DataModule
import io.github.lukwol.domain.dependency.DomainModule
import io.github.lukwol.presentation.dependency.PresentationModule
import io.github.lukwol.presentation.navigation.AppScreensNavigation
import org.koin.compose.KoinApplication
import org.koin.core.logger.Level

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
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
    }
}
