package com.example.studybuddygo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding // Import padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.studybuddygo.navigation.AppNavigation
import com.example.studybuddygo.ui.theme.StudyBuddyGoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyBuddyGoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(modifier = Modifier.padding(innerPadding)) // Pass modifier with padding
                }
            }
        }
    }
}