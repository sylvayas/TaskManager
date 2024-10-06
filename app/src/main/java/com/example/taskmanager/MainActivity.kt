package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background

                )

                {

                }
            }
        }
    }
}

@Composable
fun TaskManager(text1: String,text2:String, modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier=Modifier.fillMaxSize()
    ){
        Column(
            horizontalAlignment =Alignment.CenterHorizontally,
            modifier = modifier,
        ) {
            val image = painterResource(R.drawable.ic_task_completed)
            Image(
                painter = image,
                contentDescription = null,
            )

            TaskText(
                text1 =text1,
                text2= text2,

            )
        }
    }




}

@Composable
fun TaskText(text1: String,text2:String, modifier: Modifier = Modifier) {

    Column(

    )
    {
        Text(
            text=text1,
            fontWeight = FontWeight.Bold,
            modifier= modifier.absolutePadding(top = 24.dp,bottom = 8.dp)

        )
        Text(
            text=text2,
            fontSize = 16.sp,
            modifier= Modifier
                .align(Alignment.CenterHorizontally)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        TaskManager("All tasks completed","Nice work!")
    }
}