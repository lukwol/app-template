package io.github.lukwol.app.android.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.lukwol.data.dependency.DataModule
import io.github.lukwol.domain.dependency.DomainModule
import io.github.lukwol.presentation.dependency.PresentationModule
import org.koin.compose.KoinApplication
import org.koin.core.logger.Level

@Composable
fun PreviewEnvironment(content: @Composable () -> Unit) {
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
        MaterialTheme(content = content)
    }
}
