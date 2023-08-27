package io.github.lukwol.presentation

import org.koin.dsl.module

val PresentationModule = module {
    includes(viewModelModule)
}
