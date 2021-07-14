package ru.mkedonsky.model

import com.google.gson.annotations.SerializedName

data class Feature(
    @SerializedName("geometry")
    val geometry: Geometry
)