package com.pramod.doctor.repository

import com.pramod.doctor.datasource.DoctorService
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class DoctorRepository @Inject constructor(private val doctorService: DoctorService) {
}