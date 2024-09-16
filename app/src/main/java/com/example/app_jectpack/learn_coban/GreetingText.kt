package com.example.app_jectpack.learn_coban

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_jectpack.R
import com.example.app_jectpack.ui.theme.App_jectpackTheme

@Composable
fun GreetingText() {

    val poppin_text = FontFamily(
        Font(R.font.poppin_text, weight = FontWeight.Black)
    )

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.message),
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = poppin_text,
            color = Color.Magenta,
//            textDecoration = TextDecoration.Underline
        )
        Text(text = stringResource(id = R.string.from),
            lineHeight = 116.sp,
            color = Color.Blue,
            style = custom_1,
            modifier = Modifier
                .align(alignment = Alignment.End)
                .border(BorderStroke(2.dp, Color.Yellow))
                .padding(10.dp)
        )
    }
}

val custom_1: TextStyle
    get() = TextStyle(
        fontSize = 50.sp
    )

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingTextPreview() {
    App_jectpackTheme {
        GreetingText()
    }
}