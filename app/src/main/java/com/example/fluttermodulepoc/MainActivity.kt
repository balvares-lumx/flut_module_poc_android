package com.example.fluttermodulepoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityContent()
        }
    }
}

@Composable
fun MainActivityContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(
            onClick = {
                startActivity(
                    FlutterActivity.createDefaultIntent(this)
                )
            }
        ) {
            Text(text = "Abrir módulo flutter")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainActivityContent()
}