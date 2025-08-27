package com.pramod.doctor.datasource

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    fun  provideApiService(retrofit: Retrofit): DoctorService{
        return retrofit.create(DoctorService::class.java)
    }


}