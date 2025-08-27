package com.hospital.core.shardprefernce

import android.content.Context
import com.hospital.core.utils.PreferenceManager

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class SharedPrefernceModule {

    @Provides
    @Singleton

    fun prvoideShardPreference(@ApplicationContext context: Context): PreferenceManager {

        return PreferenceManager(context)

    }
}