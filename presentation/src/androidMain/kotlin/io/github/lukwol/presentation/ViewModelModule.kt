package io.github.lukwol.presentation

import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

actual val viewModelModule = module {
    viewModelOf(::FirstScreenViewModel)
    viewModelOf(::SecondScreenViewModel)
    viewModelOf(::ThirdScreenViewModel)
}
