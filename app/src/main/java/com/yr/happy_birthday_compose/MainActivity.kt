package com.yr.happy_birthday_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.yr.happy_birthday_compose.ui.theme.HappybirthdaycomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappybirthdaycomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText("Happy Birthday!", from = "- from Teresa")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(text = message, fontSize = 36.sp)
        Text(text = from, fontSize = 24.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappybirthdaycomposeTheme {
        BirthdayGreetingWithText("Happy Birthday!", from = "- from Teresa")
    }
}