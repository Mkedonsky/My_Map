package ru.mkedonsky.input

import ru.mkedonsky.`interface`.RetrofitServices
import ru.mkedonsky.retrofit.RetrofitClient

object Input {
    private  var BASE_URL = "https://waadsu.com/api/"
    val retrofitServices :RetrofitServices
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)


}