package com.example.actividad2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// IMPORTS DE TUS COMPONENTES Y SECCIONES
import com.example.actividad2.ui.components.ExploraCard
import com.example.actividad2.ui.components.HeaderComponent
import com.example.actividad2.ui.sections.CategoriesSection
import com.example.actividad2.ui.sections.PopularDestinationsSection

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4A3780))
            .verticalScroll(rememberScrollState())
    ) {
        HeaderComponent()

        Spacer(modifier = Modifier.height(8.dp))

        ExploraCard()

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 16.dp)
        ) {
            Column {
                CategoriesSection()

                Spacer(modifier = Modifier.height(20.dp))

                PopularDestinationsSection()
            }
        }
    }
}