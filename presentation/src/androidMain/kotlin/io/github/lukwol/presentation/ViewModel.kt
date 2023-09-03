package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.module.dsl.DefinitionOptions
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.scope.Scope
import org.koin.androidx.compose.koinViewModel as androidKoinViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf as androidViewModelOf

@Composable
actual inline fun <reified VM : ViewModel> koinViewModel(
    scope: Scope,
    noinline parameters: ParametersDefinition?,
): VM = androidKoinViewModel(
    scope = scope,
    parameters = parameters,
)

actual inline fun <reified R : ViewModel> Module.viewModelOf(
    crossinline constructor: () -> R,
    noinline options: DefinitionOptions<R>?,
): KoinDefinition<R> = androidViewModelOf(
    constructor = constructor,
    options = options,
)
