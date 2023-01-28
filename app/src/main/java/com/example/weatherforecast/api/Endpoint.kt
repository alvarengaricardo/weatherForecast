package com.example.weatherforecast.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoint {

    @GET("/weather?lat={latitude}&lon={longitude}&appid=f45d602e36fc46d843ea8acebb5917f5&units=metric&lang=pt_br")
    fun getWeather(@Path(value = "latitude", encoded = true) from : String, @Path(value = "longitude", encoded = true) to : String) : Call<JsonObject>
}
