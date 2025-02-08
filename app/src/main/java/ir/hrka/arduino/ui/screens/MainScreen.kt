package ir.hrka.arduino.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.hrka.arduino.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val snackBarHostState = remember { SnackbarHostState() }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        snackbarHost = {
            SnackbarHost(
                modifier = Modifier
                    .fillMaxWidth(),
                hostState = snackBarHostState
            )
        },
        topBar = { MainAppBar() }
    ) { innerPaddings ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPaddings),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = modifier
                    .size(80.dp)
                    .clip(CircleShape),
                onClick = {}
            ) {
                Text(stringResource(R.string.led_button_text))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.main_screen_top_bar_title),
                fontWeight = FontWeight.Bold
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(modifier: Modifier = Modifier) {
    MainScreen()
}