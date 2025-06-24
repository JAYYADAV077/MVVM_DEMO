package com.example.todo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class Viewmodel: ViewModel(){
    private val _buttonData = MutableLiveData<Api>()
    val buttonData : LiveData<Api> = _buttonData

 val repo: Repo = Repo()
    
    fun getApiData(){
    viewModelScope.launch {
        val data = repo.apiData()
        _buttonData.value = data
    }
}
}

