package com.survivalcoding.gangnam2kiandroidstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons.BigButton
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons.MediumButton
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons.SmallButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    BigButton("Button", onClick = {
                        println("BigButton 눌림!!!")
                    })
                    Spacer(modifier = Modifier.size(12.dp))

                    BigButton("Disabled", enabled = false)
                    Spacer(modifier = Modifier.size(12.dp))

                    MediumButton("Button", onClick = {
                        println("MediumButton 눌림!!!")
                    })
                    Spacer(modifier = Modifier.size(12.dp))

                    MediumButton("Disabled", enabled = false)
                    Spacer(modifier = Modifier.size(12.dp))

                    SmallButton("Button", onClick = {
                        println("SmallButton 눌림!!!")
                    })
                    Spacer(modifier = Modifier.size(12.dp))

                    SmallButton("Disabled", enabled = false)
                }

            }


        }
    }
}

