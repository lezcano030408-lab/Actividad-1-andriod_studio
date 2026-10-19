package com.example.actividad2.ui.sections

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actividad2.ui.components.CategoryItem

@Composable
fun CategoriesSection() {
    val categories = listOf("Montaña", "Bosque", "Playa", "Ciudad", "Favoritos")

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(categories) { categoryName ->
            CategoryItem(title = categoryName)
        }
    }
}