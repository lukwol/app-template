package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel
import org.koin.compose.koinInject

@Composable
actual inline fun <reified VM : ViewModel> koinViewModel(): VM = koinInject()
