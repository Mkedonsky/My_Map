package ru.mkedonsky.`interface`

import retrofit2.Call
import retrofit2.http.GET
import ru.mkedonsky.model.MultiPolygon

interface RetrofitServices {
    @GET("api/russia.geo.json")

    fun getCoordinatesList():Call<MutableList<MultiPolygon>>



}