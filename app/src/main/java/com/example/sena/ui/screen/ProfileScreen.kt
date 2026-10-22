package com.example.sena.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    userName: String,
    onNavigateToSettings: () -> Unit,
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Ruta 4: Perfil de Usuario (Con 1 parámetro)")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Usuario: $userName")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onNavigateToSettings) {
                Text(text = "Ir a Ajustes (Ruta 5)")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = onNavigateToHome) {
                Text(text = "Volver a Inicio")
            }
        }
    }
}
