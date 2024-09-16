package com.example.app_jectpack.learn_coban

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_jectpack.R
import com.example.app_jectpack.ui.theme.App_jectpackTheme

@Composable
fun Add_Image() {
    Column {
        val image1 = painterResource(R.drawable.image_1)
        val image2 = painterResource(R.drawable.image_2)
        val image3 = painterResource(R.drawable.image_3)
        val image4 = painterResource(R.drawable.image_4)
        val image5 = painterResource(R.drawable.image_5)

        Box() {
//            Image(painter = image1, contentDescription = null)
//            Image(painter = image2, contentDescription = null)
//            Image(painter = image3, contentDescription = null)
            Image(
                painter = image5,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop,
                alpha = 0.8f

            )

            GreetingText()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Add_ImagePreview() {
    App_jectpackTheme {
        Add_Image()
    }
}