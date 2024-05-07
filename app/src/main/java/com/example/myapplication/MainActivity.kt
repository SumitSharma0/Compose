package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview(widthDp = 450, heightDp = 100)
@Composable
fun showView(){
    Text(
        text = "Hello Sumit kumar sharma",
        color = Color.Green
    )
}


@Preview(widthDp = 450, heightDp = 100)
@Composable
fun showView2(){
    Text(text = "Hello Sumit kumar sharma 22",
        color = Color.Blue)
}