package com.sena.first_project.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ConText(text: String, color: Color = Color.Black, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = color,
        modifier = modifier
    )

}