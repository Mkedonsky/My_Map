package ru.mkedonsky.model

import com.google.gson.annotations.SerializedName


data class MultiPolygon (
    @SerializedName("features")
    val features: List<Feature>

)