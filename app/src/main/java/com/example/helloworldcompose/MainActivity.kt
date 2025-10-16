package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PrimerVent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PrimerVent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ) {
        // titulos de la primer ventana
        Text(text = "Onion Math")
        Text(text = "kyzamiz")
        Text(text = "Grade 4")

        Spacer(modifier = Modifier.height(20.dp))

        // Cuadro de color verde
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            color = Color.Green,
            shape = MaterialTheme.shapes.medium
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Numbers")
                Text(text = "Hello cuddly numbers!")

                Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Start", color = Color.Black)

            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Texto Courses
        Text(text = "Courses")

        Spacer(modifier = Modifier.height(12.dp))

        // Lista de cursos
        CuadroV1(title = "Try for 7 Days", price = "$9.9", date = "Start on Aug. 1st")
        CuadroV1(title = "Autumn Term", price = "$398", date = "Start on Sep. 1st")
    }
}

@Composable
fun CuadroV1(title: String, price: String, date: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        color = Color(0xFFEFEFEF),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = title)
                Text(text = date)
            }
            Text(text = price)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PrimerVentScreenPreview() {
    HelloWorldComposeTheme {
        PrimerVent()
    }
}
