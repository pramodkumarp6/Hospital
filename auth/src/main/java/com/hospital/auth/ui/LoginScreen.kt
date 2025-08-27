package com.hospital.auth.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hospital.auth.AuthViewModel


@Composable
fun LoginScreen(navController: NavController,authViewModel: AuthViewModel= hiltViewModel()) {


    var email by remember { mutableStateOf("pramod") }
    var password by remember { mutableStateOf("false") }


}


@Preview(showBackground = true)
@Composable
fun priviewLoginScreen(){
    val navController = rememberNavController()
    LoginScreen(navController)

}
