package com.example.myapplication.Exercicis

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Exercici3(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            QuadrantTargeta(
                titol = "Text composable",
                descripcio = "Displays text and follows the recommended Material Design guidelines.",
                colorFons = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantTargeta(
                titol = "Image composable",
                descripcio = "Creates a composable that lays out and draws a given Painter class object.",
                colorFons = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        // Fila inferior
        Row(Modifier.weight(1f)) {
            QuadrantTargeta(
                titol = "Row composable",
                descripcio = "A layout composable that places its children in a horizontal sequence.",
                colorFons = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantTargeta(
                titol = "Column composable",
                descripcio = "A layout composable that places its children in a vertical sequence.",
                colorFons = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun QuadrantTargeta(
    titol: String,
    descripcio: String,
    colorFons: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFons)
            .padding(16.dp), // Marge interior
        verticalArrangement = Arrangement.Center, // Centra verticalment
        horizontalAlignment = Alignment.CenterHorizontally // Centra horitzontalment
    ) {
        Text(
            text = titol,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcio,
            textAlign = TextAlign.Justify
        )
    }
}