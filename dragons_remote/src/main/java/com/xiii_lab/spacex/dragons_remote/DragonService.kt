package com.xiii_lab.spacex.dragons_remote

import com.xiii_lab.spacex.domain.dragon.DragonModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by XIII-th on 07.03.2022
 */
internal interface DragonService {

    @GET("dragons")
    fun listDragons(): Call<List<DragonModel>>
}