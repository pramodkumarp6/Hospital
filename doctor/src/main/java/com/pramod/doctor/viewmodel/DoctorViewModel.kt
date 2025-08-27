package com.pramod.doctor.viewmodel

import androidx.lifecycle.ViewModel
import com.pramod.doctor.repository.DoctorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DoctorViewModel @Inject constructor(private val doctorRepository: DoctorRepository): ViewModel() {
}