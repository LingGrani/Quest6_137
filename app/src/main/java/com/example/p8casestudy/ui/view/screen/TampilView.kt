package com.example.p8casestudy.ui.view.screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p8casestudy.R
import com.example.p8casestudy.ui.model.Mahasiswa
import com.example.p8casestudy.ui.model.RencanaStudi

@Composable
fun TampilView(
    uiStateMhs: Mahasiswa,
    uiStateMK: RencanaStudi,
    onBackButtonClicked: () -> Unit = {},
    onResetButtonClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize().background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id =  R.drawable.img),
                contentDescription = "",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(50.dp)
            )
            Box {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        Column (
            modifier = Modifier.fillMaxSize()
                .background(Color.White)
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (
                ){
                    Text("Nim:", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(uiStateMhs.nim)
                    Text("Nama:", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(uiStateMhs.nama)
                }
                Column (
                ){
                    Text(text = "Email", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(uiStateMhs.email)
                }
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Column (
                modifier = Modifier.fillMaxWidth()
            ){
                Text("Matakuliah yang diambli:",  fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(uiStateMK.namaMK)
                Row(){
                    Text(text = "Kelas:", fontSize = 16.sp)
                    Text(uiStateMK.kelas, fontSize = 16.sp)
                }
            }
            Spacer(modifier = Modifier.padding(32.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Button(onClick = {onBackButtonClicked()}) {
                    Text(text = "Kembali")
                }
                Button(onClick = {onResetButtonClicked()}) {
                    Text(text = "Reset")
                }
            }
        }
    }
}