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

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SegVentana(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun SegVentana(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Onion Math")
        Text(text = "kyzamiz")
        Text(text = "Grade 4")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Deadline is coming!")
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Learning")
        Spacer(modifier = Modifier.height(12.dp))

        CuadroVent(title = "Autumn Term", subtitle = "Week 1")
        CuadroVent(title = "Try for 7 Days", subtitle = "Day 2")
    }
}


@Composable
fun CuadroVent(title: String, subtitle: String) {
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
                Text(text = subtitle)
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(text = "Start", color = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SegVentanaScreenPreview() {
    HelloWorldComposeTheme {
        SegVentana()
    }
}
