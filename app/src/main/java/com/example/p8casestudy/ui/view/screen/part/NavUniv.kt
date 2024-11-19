package com.example.p8casestudy.ui.view.screen.part

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p8casestudy.R

@Composable
fun NavUniv(){
    Spacer(modifier = Modifier.padding(top = 16.dp))
    Row (
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "umy",
            modifier = Modifier.size(45.dp)
        )
        Spacer(modifier = Modifier.padding(start = 16.dp))
        Column {
            Text(text = "Universitas Muhammadiyah Yogyakarta",
                color = Color.Red,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Unggul dan Islami",
                color = Color.Red,
                fontWeight = FontWeight.Light
            )
        }
    }
}