package com.hospital.auth.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hospital.auth.AuthViewModel

@Composable
fun PasswordChangeScreen(navController: NavHostController,authViewModel: AuthViewModel= hiltViewModel()) {
}

@Preview(showBackground = true)
@Composable
fun priviewPasswordChangeScreen(){
    val navController = rememberNavController()
    PasswordChangeScreen(navController)

}
