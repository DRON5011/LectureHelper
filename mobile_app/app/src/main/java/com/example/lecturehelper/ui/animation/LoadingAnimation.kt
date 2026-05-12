package com.example.lecturehelper.ui.animation

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoadingAnimation() {

    val infiniteTransition =
        rememberInfiniteTransition()

    val progress by infiniteTransition.animateFloat(

        initialValue = 0f,

        targetValue = 1f,

        animationSpec = infiniteRepeatable(

            animation = tween(1000),

            repeatMode = RepeatMode.Restart
        )
    )

    Box {

        CircularProgressIndicator(

            progress = progress,

            modifier = Modifier.size(64.dp)
        )
    }
}