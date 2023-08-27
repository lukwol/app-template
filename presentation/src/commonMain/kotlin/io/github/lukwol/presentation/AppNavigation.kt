package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ScreensNavigation
import io.github.lukwol.presentation.screen.first.FirstScreen
import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel

@Composable
fun AppNavigation() {
    ScreensNavigation(
        startRoute = AppRoutes.FirstScreenRoute,
    ) {
        screen(
            route = AppRoutes.FirstScreenRoute,
            viewModelFactory = { koinViewModel<FirstScreenViewModel>() },
        ) { viewModel ->
            FirstScreen(viewModel)
        }
        screen(
            route = AppRoutes.SecondScreenRoute,
            viewModelWithArgs = { args: String? ->
                koinViewModel<SecondScreenViewModel>().apply {
                    firstText = args.orEmpty().ifEmpty { "No text passed" }
                }
            },
        ) { viewModel ->
            SecondScreen(viewModel)
        }
        screen(
            route = AppRoutes.ThirdScreenRoute,
            viewModelWithArgs = { args: List<String>? ->
                koinViewModel<ThirdScreenViewModel>().apply {
                    texts = args.orEmpty()
                }
            },
        ) { viewModel ->
            ThirdScreen(viewModel)
        }
    }
}
