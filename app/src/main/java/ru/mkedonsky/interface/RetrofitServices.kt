package ru.mkedonsky.`interface`

import retrofit2.Response
import retrofit2.http.GET
import ru.mkedonsky.model.MultiPolygon

interface RetrofitServices {
    @GET("russia.geo.json")

    fun getCoordinatesList():Response<MultiPolygon>



}