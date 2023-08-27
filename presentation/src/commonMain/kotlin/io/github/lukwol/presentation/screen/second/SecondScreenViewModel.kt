package io.github.lukwol.presentation.screen.second

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import io.github.lukwol.navigation.screens.viewmodel.ViewModel

class SecondScreenViewModel : ViewModel() {
    lateinit var firstText: String
    var secondText by mutableStateOf("")
}
