package com.pramod.hospital

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HospitalBase: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}