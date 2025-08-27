package com.hospital.patient.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.hospital.patient.viewmodel.PatientViewModel


@Composable
fun PatientDashBoard (){
    val patientViewModel: PatientViewModel = hiltViewModel()
}