package ru.mkedonsky.model

import com.google.gson.annotations.SerializedName


data class MultiPolygon (
    @SerializedName("coordinates")
    var coordinates: String,

)