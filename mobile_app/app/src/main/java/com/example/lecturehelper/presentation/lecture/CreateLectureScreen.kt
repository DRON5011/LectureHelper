package com.example.lecturehelper.presentation.lecture

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CreateLectureScreen(
    onLectureCreated: () -> Unit
) {

    var lectureTitle by remember { mutableStateOf("") }
    var lectureDescription by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "Создание лекции",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = lectureTitle,
            onValueChange = { lectureTitle = it },
            label = { Text("Название лекции") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = lectureDescription,
            onValueChange = { lectureDescription = it },
            label = { Text("Описание") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                onLectureCreated()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Создать лекцию")
        }
    }
}
