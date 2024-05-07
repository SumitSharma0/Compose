package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview(widthDp = 450, heightDp = 100, backgroundColor = 111111)
@Composable
fun showView(){
    Text(
        text = "Hello Sumit kumar sharma",
        color = Color.Green,
        fontSize = 36.sp,
        fontWeight = FontWeight.ExtraBold,
        fontStyle = FontStyle.Italic
    )
}


@Preview(showBackground = true, widthDp = 750, heightDp = 450)
@Composable
fun showView2(){
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Red,
            containerColor = Color.Blue
        )
        ) {
        Text(text = "Hello buttom",
            fontSize = 45.sp)
        Image(
            painter = painterResource(id = R.drawable.baseline_castle_24),
            contentDescription = "cassle image")
    }
}