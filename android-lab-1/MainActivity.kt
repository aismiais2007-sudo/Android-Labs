package com.example.myapplicationais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationais.ui.theme.MyApplicationaisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationaisTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileCardScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileCardScreen() {
    val brown = Color(0xFF8D5B4C)
    val beige = Color(0xFFF7F3F0)

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(beige, RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        modifier = Modifier.size(45.dp).clip(CircleShape).background(brown),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("А", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                    Column {
                        Text("Абдулатифова Айсулуу", fontWeight = FontWeight.Bold)

                    }
                }

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("12 проект.", modifier = Modifier.weight(1f), fontSize = 13.sp)
                    Text("48 задач", modifier = Modifier.weight(1f), fontSize = 13.sp)
                    Text("5 лет опыт", modifier = Modifier.weight(1f), fontSize = 13.sp)
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = brown)
                    ) {
                        Text("Написать")
                    }

                    
                }
            }
        }
    }
}
