package io.github.lukwol.app

import io.github.lukwol.data.DataModule
import io.github.lukwol.domain.DomainModule
import io.github.lukwol.presentation.PresentationModule
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
