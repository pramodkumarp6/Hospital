package com.pramod.hospital

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hospital.auth.ui.LoginScreen
import com.hospital.auth.ui.OtpScreen
import com.hospital.auth.ui.PasswordChangeScreen
import com.hospital.auth.ui.RegisterScreen
import com.hospital.auth.ui.UserForgetScreen
import com.pramod.hospital.splash.SplashScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "SplashScreen") {

        composable("SplashScreen") {
            SplashScreen(navController)
        }

        composable("LoginScreen") {
            LoginScreen(navController)
        }


        composable("RegisterScreen") {
            RegisterScreen(navController)
        }


        composable("OtpScreen") {
            OtpScreen(navController)
        }
        composable("UserForgetScreen") {
            UserForgetScreen(navController)
        }

        composable("PasswordChangeScreen") {
            PasswordChangeScreen(navController)
        }

    }
}