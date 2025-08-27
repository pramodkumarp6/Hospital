package com.hospital.auth

import com.pramod.hospital.core.network.ApiService
import javax.inject.Inject

class AuthRepository @Inject constructor(private val apiService: ApiService) {



   suspend fun loginUser( email: String,
                          password: String,
                          onSucess:()-> Unit,
                          onError:(Throwable)-> Unit,) {

       try {

       }catch(e:Exception){
               error(e)
           }
       }

    }

