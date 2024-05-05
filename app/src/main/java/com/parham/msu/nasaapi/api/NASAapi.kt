package com.parham.msu.nasaapi.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "uewSFZwIBwnOA4DCjbSKBFEA9HBBPCfDHkQxTVcN"

interface NASAapi {
    @GET("planetary/apod")
    suspend fun fetchGalleryItems(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("count") count: Int = 50 // Fetches 50 random APOD entries
    ): List<GalleryItem>
}