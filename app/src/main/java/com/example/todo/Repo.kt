package com.example.todo

import kotlinx.coroutines.delay

class Repo {
  suspend fun apiData(): Api{
      delay(2000)
        return Api(20,"jay")
    }
}