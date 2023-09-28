package io.github.lukwol.presentation.dependency

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel
import org.koin.compose.LocalKoinScope
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.module.dsl.DefinitionOptions
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.scope.Scope

@Composable
expect inline fun <reified VM : ViewModel> koinViewModel(
    scope: Scope = LocalKoinScope.current,
    noinline parameters: ParametersDefinition? = null,
): VM

expect inline fun <reified R : ViewModel> Module.viewModelOf(
    crossinline constructor: () -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R>
