package io.github.lukwol.presentation.dependency

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel
import org.koin.compose.koinInject
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.module.dsl.DefinitionOptions
import org.koin.core.module.dsl.factoryOf
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.scope.Scope

@Composable
actual inline fun <reified VM : ViewModel> koinViewModel(
    scope: Scope,
    noinline parameters: ParametersDefinition?,
): VM =
    koinInject(
        scope = scope,
        parameters = parameters,
    )

actual inline fun <reified R : ViewModel> Module.viewModelOf(
    crossinline constructor: () -> R,
    noinline options: DefinitionOptions<R>?,
): KoinDefinition<R> =
    factoryOf(
        constructor = constructor,
        options = options,
    )
