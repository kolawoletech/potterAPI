package com.kola.potterapi

import com.kola.potterapi.ui.Characters
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface IService {



    @GET("/3/movie/popular")
    fun getCharacters(@Query("api_key") key: String): Call<Characters>
}