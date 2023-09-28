package io.github.lukwol.presentation.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.viewmodel.ScreensNavigation
import io.github.lukwol.presentation.dependency.koinViewModel
import io.github.lukwol.presentation.screen.first.FirstScreen
import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import io.github.lukwol.presentation.screen.second.SecondScreen
import io.github.lukwol.presentation.screen.second.SecondScreenViewModel
import io.github.lukwol.presentation.screen.third.ThirdScreen
import io.github.lukwol.presentation.screen.third.ThirdScreenViewModel

@Composable
fun AppScreensNavigation() {
    ScreensNavigation(
        startRoute = ScreenRoutes.FirstScreenRoute,
        enterTransition = {
            slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left)
        },
        exitTransition = {
            slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left)
        },
        popEnterTransition = {
            slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Right)
        },
        popExitTransition = {
            slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right)
        },
    ) {
        screen(
            route = ScreenRoutes.FirstScreenRoute,
            viewModelFactory = { koinViewModel<FirstScreenViewModel>() },
        ) { viewModel ->
            FirstScreen(viewModel)
        }
        screen(
            route = ScreenRoutes.SecondScreenRoute,
            viewModelWithArgs = { args: String? ->
                koinViewModel<SecondScreenViewModel>().apply {
                    firstText = args.orEmpty().ifEmpty { "No text passed" }
                }
            },
        ) { viewModel ->
            SecondScreen(viewModel)
        }
        screen(
            route = ScreenRoutes.ThirdScreenRoute,
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
