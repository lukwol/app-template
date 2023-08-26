package io.github.lukwol.app

import androidx.compose.runtime.Composable
import io.github.lukwol.app.screen.FirstScreen
import io.github.lukwol.app.screen.SecondScreen
import io.github.lukwol.app.screen.ThirdScreen
import io.github.lukwol.navigation.screens.ScreensNavigation

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
