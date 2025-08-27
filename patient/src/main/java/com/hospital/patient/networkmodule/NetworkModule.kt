package com.hospital.patient.networkmodule

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object  NetworkModule{


    @Provides
    @Singleton
    fun providerApiService(retrofit: Retrofit): PatientService{

        return retrofit.create(PatientService::class.java)
    }
}