package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ViewModel
import org.koin.androidx.compose.koinViewModel as koinAndroidViewModel

@Composable
actual inline fun <reified VM : ViewModel> koinViewModel(): VM = koinAndroidViewModel()
