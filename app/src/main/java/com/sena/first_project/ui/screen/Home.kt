package com.sena.first_project.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.first_project.ui.composable.ConText
import com.sena.first_project.ui.section.Header

@Composable
fun Home(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Gray
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 1. Sección superior (Header)
            Header()

            // 2. Sección central con colores
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                )
                {
                    Box(modifier = Modifier.size(50.dp).background(Color.Yellow))
                    Box(modifier = Modifier.size(50.dp).background(Color.Blue))
                    Box(modifier = Modifier.size(50.dp).background(Color.Red))
                }
            }

            // 3. Sección inferior usando el componente ConText
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ) {
                ConText(text = "Hola soy el footer", color = Color.White)
            }
        }
    }
}