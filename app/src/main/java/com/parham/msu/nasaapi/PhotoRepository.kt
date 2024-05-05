package com.parham.msu.nasaapi

import com.parham.msu.nasaapi.api.GalleryItem
import com.parham.msu.nasaapi.api.NASAapi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class PhotoRepository {
    private val nasAapi: NASAapi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        nasAapi = retrofit.create(NASAapi::class.java)
    }

    suspend fun fetchPhotos(): List<GalleryItem> =
        nasAapi.fetchGalleryItems(apiKey = "uewSFZwIBwnOA4DCjbSKBFEA9HBBPCfDHkQxTVcN", count = 50)
}

