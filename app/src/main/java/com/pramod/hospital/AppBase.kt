package com.pramod.hospital

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class AppBase: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}