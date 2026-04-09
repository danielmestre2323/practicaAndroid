package com.example.myapplication.ExercicisStateless

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun Exercici5(modifier: Modifier = Modifier) {
    // Definim la paleta de colors de l'exercici
    val backgroundColor = Color(0xFFD2E8D4)
    val darkGreenText = Color(0xFF006D3B)
    val logoDarkBackground = Color(0xFF073042)
    val logoGreen = Color(0xFF3DDC84)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .background(logoDarkBackground)
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_android_black_24dp),
                    contentDescription = "Logo de Android",
                    modifier = Modifier.size(80.dp),
                    tint = logoGreen
                )
            }

            Text(
                text = "Jennifer Doe",
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
            )

            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 14.sp,
                color = darkGreenText,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier.padding(bottom = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FilaContacte(icon = Icons.Rounded.Phone, text = "+11 (123) 444 555 666", tint = darkGreenText)
            FilaContacte(icon = Icons.Rounded.Share, text = "@AndroidDev", tint = darkGreenText)
            FilaContacte(icon = Icons.Rounded.Email, text = "jen.doe@android.com", tint = darkGreenText)
        }
    }
}


@Composable
fun FilaContacte(icon: ImageVector, text: String, tint: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}