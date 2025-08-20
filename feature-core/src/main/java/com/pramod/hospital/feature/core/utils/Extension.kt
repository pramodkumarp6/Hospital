package com.pramod.hospital.feature.core.utils

import android.content.Context
import android.widget.Toast
import androidx.annotation.UiContext


fun Toast(context: Context,message: String){
    Toast.makeText(context,message,Toast.LENGTH_LONG).show()
}