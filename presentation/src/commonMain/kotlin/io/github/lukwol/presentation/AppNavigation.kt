package io.github.lukwol.presentation

import androidx.compose.runtime.Composable
import io.github.lukwol.navigation.screens.ScreensNavigation
import io.github.lukwol.presentation.screen.FirstScreen
import io.github.lukwol.presentation.screen.SecondScreen
import io.github.lukwol.presentation.screen.ThirdScreen

@Composable
fun AppNavigation() {
    ScreensNavigation(
        startRoute = AppRoutes.FirstScreenRoute,
    ) {
        screen(AppRoutes.FirstScreenRoute) {
            FirstScreen()
        }
        screen(AppRoutes.SecondScreenRoute) { args: String? ->
            SecondScreen(args)
        }
        screen(AppRoutes.ThirdScreenRoute) { args: List<String>? ->
            ThirdScreen(args)
        }
    }
}
