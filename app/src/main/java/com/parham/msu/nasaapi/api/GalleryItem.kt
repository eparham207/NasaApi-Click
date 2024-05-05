package com.parham.msu.nasaapi.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    @Json(name = "url") val url: String,
    @Json(name = "explanation") val explanation: String,
    @Json(name = "date") val date: String,
    @Json(name = "media_type") val mediaType: String,
    @Json(name = "hdurl") val hdUrl: String? = null
)
