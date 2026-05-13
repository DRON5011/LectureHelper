package com.example.lecturehelper.presentation.recording

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecordingScreen(

    viewModel: RecordingViewModel

) {

    var isRecording by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text =
                if (isRecording)
                    "Идёт запись лекции"
                else
                    "Запись остановлена",

            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(

            onClick = {

                isRecording = !isRecording
            },

            modifier = Modifier.fillMaxWidth()

        ) {

            Text(

                text =
                    if (isRecording)
                        "Остановить запись"
                    else
                        "Начать запись"
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(

            onClick = {

            },

            modifier = Modifier.fillMaxWidth()

        ) {

            Text("Добавить проблемное место")
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(

            onClick = {

            },

            modifier = Modifier.fillMaxWidth()

        ) {

            Text("Добавить метафору")
        }
    }
}