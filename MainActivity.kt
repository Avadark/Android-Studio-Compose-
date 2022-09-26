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
import androidx.compose.ui.text.style.TextAlign

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
                    ComposeArticle("Jetpack Compose tutorial",
                        "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")

                }
            }
        }
    }
}
@Composable
fun ComposeArticle(message1: String,message2: String,message3:String) {
        Column() {
            val image= painterResource(R.drawable.bg_compose_background)
            Image(
                painter = image , contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(),

                )
            Text(
                text = message1,
                fontSize= 24.sp,
                modifier= Modifier
                    .background(color = Color.Transparent)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp,bottom = 16.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
            )
            Text(
                text = message2,
                modifier= Modifier
                    .background(color = Color.Transparent)
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End),

            )
            Text(
                text = message3,
                modifier= Modifier
                    .background(color = Color.Transparent)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp,bottom = 16.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Justify
            )
        }
    }



@Preview(showBackground = true,showSystemUi = true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayTheme() {
        ComposeArticle("Jetpack Compose tutorial",
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}















