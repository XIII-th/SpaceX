package com.xiii_lab.spacex.launches_remote

import com.xiii_lab.spacex.domain.launch.LaunchModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by XIII-th on 07.03.2022
 */
internal interface LaunchesService {

    @GET("launches")
    fun listLaunches(): Call<List<LaunchModel>>
}