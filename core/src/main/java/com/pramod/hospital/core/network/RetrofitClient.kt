package com.pramod.hospital.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())

            .build()


    }

    fun provideApiService(): ApiService{
        return provideRetrofit().create(ApiService::class.java)

    }
}