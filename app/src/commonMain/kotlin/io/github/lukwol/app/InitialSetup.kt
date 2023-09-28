package io.github.lukwol.app

import io.github.lukwol.data.dependency.DataModule
import io.github.lukwol.domain.dependency.DomainModule
import io.github.lukwol.presentation.dependency.PresentationModule
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

fun initialSetup() {
    startKoin {
        printLogger(Level.INFO)
        modules(
            DataModule,
            DomainModule,
            PresentationModule,
        )
    }
}
