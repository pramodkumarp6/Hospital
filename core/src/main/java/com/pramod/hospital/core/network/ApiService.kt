package com.pramod.hospital.core.network

import retrofit2.http.POST

interface ApiService {

    @POST
    suspend fun login()
}