package io.github.lukwol.presentation.screen.second

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.lukwol.navigation.screens.LocalScreensController
import io.github.lukwol.presentation.navigation.ScreenRoutes

@Composable
fun SecondScreen(viewModel: SecondScreenViewModel) {
    val screensController = LocalScreensController.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(viewModel.firstText)

        Spacer(Modifier.height(20.dp))

        TextField(
            value = viewModel.secondText,
            placeholder = {
                Text("Type something else...")
            },
            onValueChange = { viewModel.secondText = it },
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                screensController.pop()
            },
        ) {
            Text("Go back")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                screensController.push(
                    route = ScreenRoutes.ThirdScreenRoute,
                    args =
                        listOf(
                            viewModel.firstText,
                            viewModel.secondText,
                        ),
                )
            },
        ) {
            Text("Go to third screen")
        }
    }
}
