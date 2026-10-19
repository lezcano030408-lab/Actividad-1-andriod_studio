package com.example.actividad2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.actividad2.ui.screens.HomeScreen
import com.example.actividad2.ui.theme.Actividad2Theme // O el tema de tu proyecto

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Actividad2Theme {
                HomeScreen()
            }
        }
    }
}