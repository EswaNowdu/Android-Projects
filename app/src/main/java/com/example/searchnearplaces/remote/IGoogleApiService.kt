package com.example.searchnearplaces.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface IGoogleApiService {
    @GET
    fun getNearPlaces(@Url url:String):Call<>


}