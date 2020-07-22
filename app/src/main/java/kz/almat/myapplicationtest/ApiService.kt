package kz.almat.myapplicationtest

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("5a488f243000004c15c3c57e")
    fun fetchAll(): Call<List<Post>>
}