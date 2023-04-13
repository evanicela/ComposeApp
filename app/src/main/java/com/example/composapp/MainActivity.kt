
package com.example.composapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //set content is a jetpack compose extension function in a an activity
        // render out views.
        setContent {
            // invoke/call my composable unit
            Column {
                greeting()
                greeting2()
            }

        }
    }

    // declarative // functions to create views and logic attached to the views // annotation allows us to declare widgets in a function format and render
    // them to the set content method // the annotation preview allows a quick glance to the activity without // running the activity
    @Preview
    @Composable
    fun greeting() {
//        inside this function we can declare composable units
        // widgets need meta data
        // unit in composable called the column composable
        Column {
            Text(
                "Niyonizigiye",
                style = TextStyle(color = Color.Green, fontWeight = FontWeight.Bold)
            )
            Text("Celestin", style = TextStyle(color = Color.Yellow, fontWeight = FontWeight.Light))
            Text("John", style = TextStyle(color = Color.Red, fontSize = 20.sp))
        }
    }


    @Preview
    @Composable
    fun greeting2() {
//        inside this function we can declare composable units // widgets need meta data // unit in composable called the column composable
        Column {
            Text(
                "Andrew",
                style = TextStyle(color = Color.Black, fontStyle = FontStyle.Italic)
            )
            Text(
                "John",
                style = TextStyle(color = Color.Black),
                modifier = Modifier.padding(all = 20.dp)
            )
            Text("ZACHARIAH", style = TextStyle(color = Color.Black))
        }
    }
    // https://www.tutorialkart.com/android-jetpack-compose/  :  check button , image, card
}


