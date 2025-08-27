package com.hospital.patient.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hospital.patient.networkmodule.PatientRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PatientViewModel @Inject constructor(private val patientRepository: PatientRepository): ViewModel(){





    fun patient(){
        viewModelScope.launch {

        }
    }
    }
