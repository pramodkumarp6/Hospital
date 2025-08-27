package com.hospital.auth

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val authRepository: AuthRepository) : ViewModel() {



    var email by mutableStateOf("")
    var password by mutableStateOf("")


    private val _name = mutableStateOf("Hello")

    val name: State<String> get() = _name


    fun update(newName: String) {
        _name.value = newName

//        private val _loginState = MutableStateFlow<LoginState>()
//        val loginState: StateFlow<LoginState> = _loginState


        fun Login(email: String, password: String) {
            viewModelScope.launch {



            }
        }
    }
}