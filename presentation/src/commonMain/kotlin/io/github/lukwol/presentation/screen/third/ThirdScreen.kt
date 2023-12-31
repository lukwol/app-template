package io.github.lukwol.presentation.screen.third

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.lukwol.navigation.screens.LocalScreensController

@Composable
fun ThirdScreen(viewModel: ThirdScreenViewModel) {
    val screensController = LocalScreensController.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        for (text in viewModel.texts) {
            Text(text.ifEmpty { "No text passed" })

            Spacer(Modifier.height(20.dp))
        }

        Button(
            onClick = {
                screensController.pop()
            },
        ) {
            Text("Go back")
        }
    }
}
