package com.example.p8casestudy.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p8casestudy.R
import com.example.p8casestudy.ui.model.Mahasiswa
import com.example.p8casestudy.ui.view.screen.part.NavUniv

@Preview
@Composable
fun MatakuliahView(
    uiState: Mahasiswa,
    onSimpanButtonClicked: (MutableList<String>) -> Unit
){
    var namamatakuliah by remember { mutableStateOf("")}
    var kelas by remember { mutableStateOf("")}
    val list = listOf("A", "B", "C")
    val listData : MutableList<String> = mutableListOf(namamatakuliah, kelas)
    Column(
        modifier = Modifier
            .fillMaxSize().background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        NavUniv()
        Column(
            modifier = Modifier.fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .padding(16.dp)
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (

                ){
                    Text("Nim:")
                    Text(uiState.nim)
                    Text("Nama:")
                    Text(uiState.nama)
                }
                Column (
                ){
                    Text(uiState.nama)
                }
            }
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = namamatakuliah,
                onValueChange = {namamatakuliah = it},
                label = { Text(text = "Mata Kuliah") },
                singleLine = true,
            )
            Column(){
                list.forEach { Selected ->
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = kelas == Selected,
                            onClick = {kelas = Selected}
                        )
                        Text(text = Selected)
                    }
                }
            }
            Button(
                onClick = {onSimpanButtonClicked(listData)},
                modifier = Modifier.fillMaxWidth()
            ){
                Text(text = "Simpan")
            }
        }
    }
}