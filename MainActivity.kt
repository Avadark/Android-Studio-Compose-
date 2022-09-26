package com.example.happybirthday

import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Birthday("Aditya ka Birthday","- from College")
                }
            }
        }
    }
}
@Composable
fun Birthday(message: String,from: String) {
    Box(){
        val image= painterResource(R.drawable.androidparty)
        Image(
            painter = image , contentDescription = null,
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column() {
            Text(
                text = message,
                fontSize= 30.sp,
                modifier=Modifier.background(color = Color.Transparent).padding(start = 16.dp, top = 16.dp, end = 16.dp).fillMaxWidth().wrapContentWidth(Alignment.Start)
            )
            Text(
                text = from,
                modifier=Modifier.background(color = Color.Transparent).padding(start = 16.dp, top = 5.dp, end = 16.dp, bottom = 16.dp).fillMaxWidth().wrapContentWidth(Alignment.End),
                fontSize= 30.sp
            )
        }
    }
}


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayTheme() {
        Birthday("Aditya Ka Birthday","- from College")
    }
}















