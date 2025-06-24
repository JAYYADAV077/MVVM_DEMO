package com.example.todo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

@Composable
fun Ui(modifier: Modifier = Modifier,viewModel: Viewmodel) {
    val userData = viewModel.buttonData.observeAsState()

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button({viewModel.getApiData()}) {
            Text("Click")
        }
        userData.value?.name?.let {
            Text(text = "Name $it", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)

        }
        userData.value?.age?.let {
            Text(text = "Name $it", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)

        }


    }

}