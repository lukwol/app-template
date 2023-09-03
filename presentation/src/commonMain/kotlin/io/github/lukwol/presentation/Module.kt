package io.github.lukwol.presentation

import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel
import org.koin.dsl.module

val PresentationModule = module {
    viewModelOf(::FirstScreenViewModel)
    viewModelOf(::SecondScreenViewModel)
    viewModelOf(::ThirdScreenViewModel)
}
