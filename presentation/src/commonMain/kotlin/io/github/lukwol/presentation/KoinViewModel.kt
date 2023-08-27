package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel

@Composable
expect inline fun <reified VM : ViewModel> koinViewModel(): VM
