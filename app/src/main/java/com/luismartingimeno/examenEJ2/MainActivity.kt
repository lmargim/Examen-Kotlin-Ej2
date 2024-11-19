package com.luismartingimeno.examenEJ2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.luismartingimeno.examenEJ2.listaColoresScreen.ListaColores
import com.luismartingimeno.examenEJ2.ui.theme.ExamenEJ2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEJ2Theme {
                ListaColores()

            }
        }
    }
}
