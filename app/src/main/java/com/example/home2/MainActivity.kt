package com.example.home2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home2.R
import com.example.home2.ui.theme.AguaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            home2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD5E8D4) // Color de fondo verde claro
                ) {
                    UserProfile()
                }
            }
        }
    }
}

@Composable
fun UserProfile() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
      
        Spacer(modifier = Modifier.size(16.dp))

        Text(
            text = "Yostin Arequipa",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.size(8.dp))

        Text(
            text = "Android Developer Senior",
            fontSize = 18.sp,
            color = Color(0xFF4CAF50) // Color verde
        )

        Spacer(modifier = Modifier.size(32.dp))

        ContactInfo(icon = R.drawable.telefono, info = "9816526266")
        ContactInfo(icon = R.drawable.compartir, info = "kevin.uscca@tecsup.edu.pe")
        ContactInfo(icon = R.drawable.telefono, info = "98164349222")
    }
}

@Composable
fun ContactInfo(icon: Int, info: String) {
    Row(
        modifier = Modifier.padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = info,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview (showBackground = true)
@Composable
fun DefaultPreview(){
    home2Theme{
        UserProfile()
    }
}