package com.example.app_jectpack

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hello() {
    Column {
        Text(text = "Xin chào mình là Ngọc", style = TextStyle(fontSize = 30.sp))
    }
}