package com.example.actividad2.ui.sections

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad2.R
import com.example.actividad2.ui.components.DestinationItem

@Composable
fun PopularDestinationsSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Destinos populares",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "Ver todos",
                color = Color(0xFF6200EE),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        DestinationItem(
            title = "Laguna Azul",
            category = "Naturaleza",
            rating = 4.8,
            description = "Un paraíso natural rodeado de montañas.",
            imageRes = R.drawable.dbs1
        )

        DestinationItem(
            title = "Playa del Sol",
            category = "Playa",
            rating = 4.6,
            description = "Aguas cristalinas y arena blanca.",
            imageRes = R.drawable.dbs2
        )

        DestinationItem(
            title = "Centro Histórico",
            category = "Cultura",
            rating = 4.7,
            description = "Historia y arquitectura en un solo lugar.",
            imageRes = R.drawable.dbs
        )
    }
}