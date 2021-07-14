package ru.mkedonsky.model

import com.google.gson.annotations.SerializedName

data class Geometry(
    @SerializedName("coordinates")
    val coordinates: List<List<List<List<Double>>>>
)
