package com.example.immmobile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.immmobile.ui.theme.IMMMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur layout activity_main sebagai konten tampilan untuk aktivitas ini
        setContentView(R.layout.activity_main)

        // Contoh mengakses elemen UI dari activity_main.xml
        val greetingText: TextView = findViewById(R.id.greeting_text)
        val signUpButton: Button = findViewById(R.id.button_sign_up)
        val loginButton: Button = findViewById(R.id.button_login)

        // Contoh mengatur aksi tombol
        signUpButton.setOnClickListener {
            // Lakukan sesuatu saat tombol sign up diklik
        }

        loginButton.setOnClickListener {
            // Mulai LoginActivity
            try {
                // Mulai LoginActivity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting LoginActivity", e)
            }
        }
    }
}
