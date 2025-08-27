package com.hospital.auth

import com.hospital.auth.datasource.AuthService
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class AuthRepository @Inject constructor(private val apiService: AuthService) {



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

