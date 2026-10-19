package com.example.actividad2.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad2.R

@Composable
fun HeaderComponent() {
    // ROW para alinear los textos a la izquierda y la imagen circular a la derecha
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Columna para los textos de "Descubre"
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Descubre",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Nuevos destinos, nuevas historias",
                fontSize = 14.sp,
                color = Color.LightGray
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        // Imagen circular de la derecha
        Image(
            painter = painterResource(id = R.drawable.dbs1), // Cambia esto por tu imagen (ej. R.drawable.perfil)
            contentDescription = "Perfil o paisaje",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape), // Esto vuelve la imagen completamente redonda
            contentScale = ContentScale.Crop
        )
    }
}