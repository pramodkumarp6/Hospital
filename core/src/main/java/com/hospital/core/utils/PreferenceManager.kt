package com.hospital.core.utils

import android.content.Context

class PreferenceManager(private val context: Context) {

    private val prefs = context.getSharedPreferences("",Context.MODE_PRIVATE)

    fun saveToken(token:String){
        prefs.edit().putString("auth_token",token).apply()
    }

    fun gettoken():String?{
        return prefs.getString("",null)
    }

    fun clear(){
        prefs.edit().clear().apply()
    }
}