package ir.hrka.arduino

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.hrka.arduino.ui.screens.MainScreen
import ir.hrka.arduino.ui.theme.ArduinoTheme

@Composable
fun AppContent(modifier: Modifier = Modifier) {
    ArduinoTheme {
        MainScreen()
    }
}