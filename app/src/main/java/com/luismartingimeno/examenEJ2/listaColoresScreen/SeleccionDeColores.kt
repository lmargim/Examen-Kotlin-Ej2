package com.luismartingimeno.examenEJ2.listaColoresScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListaColores() {
    var colorSeleccionado by remember { mutableStateOf(Color.Black) }
    val listaColores = listOf(
        Color.Black,
        Color.Gray,
        Color.Green,
        Color.Red,
        Color.DarkGray,
        Color.LightGray,
        Color.Blue,
        Color.Yellow,
        Color.Cyan,
        Color.Magenta
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
    ) {
        listaColores.forEach { color ->
            Button(
                onClick = {
                    colorSeleccionado = color
                },
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(1f),
                colors = ButtonDefaults.buttonColors(containerColor = color)
            ) {

            }
        }
        BoxColorSeleccionado(colorSeleccionado)
    }
}

@Composable
fun BoxColorSeleccionado(color: Color) {

    Column(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )
    }
}