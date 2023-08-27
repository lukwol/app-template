package io.github.lukwol.presentation

import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

actual val viewModelModule = module {
    factoryOf(::FirstScreenViewModel)
    factoryOf(::SecondScreenViewModel)
    factoryOf(::ThirdScreenViewModel)
}
