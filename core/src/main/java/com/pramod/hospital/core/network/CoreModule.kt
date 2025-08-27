package com.pramod.hospital.core.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CoreModule {


    @Provides
    @Singleton
     fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://your-api-domain.com/")
            .addConverterFactory(GsonConverterFactory.create())

            .build()


    }


}