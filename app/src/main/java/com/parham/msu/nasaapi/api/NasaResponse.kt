package com.parham.msu.nasaapi.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NasaResponse(
    val photos: PhotoResponse
)
