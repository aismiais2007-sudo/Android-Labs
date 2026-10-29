package com.example.aisapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.aisapplication.ui.theme.AisApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AisApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CampusCardScreen()
                }
            }
        }
    }
}

@Composable
fun CampusCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        
        Text(text = "Карта кампуса", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Абдулатифова Айсулуу (CS-25-1)")

        HorizontalDivider()

    
        Text(text = "Расписание:", style = MaterialTheme.typography.titleLarge)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("09:00")
            Text(
                text = "Web-разработка",
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            )
            Text("Каб. 304")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("11:00")
            Text(
                text = "Базы данных",
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            )
            Text("Лаба 2")
        }
    }
}
