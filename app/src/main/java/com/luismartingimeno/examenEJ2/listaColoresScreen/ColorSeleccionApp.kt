package com.luismartingimeno.examenEJ2.listaColoresScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
fun ColorSeleccionApp() {

    var selectedColor by remember { mutableStateOf(Color.Gray) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SelectorDeColor(
            colors = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Cyan),
            onColorSelected = { selectedColor = it }
        )

        Spacer(modifier = Modifier.height(32.dp))


        Box(
            modifier = Modifier
                .size(100.dp)
                .background(selectedColor, shape = CircleShape),
        )
    }
}