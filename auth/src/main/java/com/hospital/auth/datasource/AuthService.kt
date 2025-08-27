package com.hospital.auth.datasource

import com.hospital.auth.model.ForgetRequest
import com.hospital.auth.model.ForgetResponse
import com.hospital.auth.model.LoginRequest
import com.hospital.auth.model.LoginResponse
import com.hospital.auth.model.OtpRequest
import com.hospital.auth.model.OtpResponse
import com.hospital.auth.model.PasswordChangeRequest
import com.hospital.auth.model.PasswordChangeResponse
import com.hospital.auth.model.RegisterRequest
import com.hospital.auth.model.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @POST("auth/register")
    suspend fun register(@Body register: RegisterRequest): RegisterResponse

    @POST("auth/userforget")
    suspend fun userForget(@Body register: ForgetRequest): ForgetResponse

    @POST("auth/otp")
    suspend fun otp(@Body register: OtpRequest): OtpResponse

    @POST("auth/passwordUpdate")
    suspend fun passwordChange(@Body register: PasswordChangeRequest): PasswordChangeResponse
}