package io.github.lukwol.presentation.screen.first

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.lukwol.navigation.screens.LocalScreensController
import io.github.lukwol.presentation.ScreenRoutes

@Composable
fun FirstScreen(viewModel: FirstScreenViewModel) {
    val screensController = LocalScreensController.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        TextField(
            value = viewModel.text,
            placeholder = {
                Text("Type something...")
            },
            onValueChange = { viewModel.text = it },
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                screensController.push(ScreenRoutes.SecondScreenRoute, viewModel.text)
            },
        ) {
            Text("Go to second screen")
        }
    }
}
