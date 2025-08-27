package com.pramod.hospital.core.utils

import android.util.Log

object Logger {

   private const val TAG = "Hospital"


    fun d(message: String){
        Log.d(TAG, message)
    }
    fun e(message: String){
        Log.e(TAG, message )
    }
}