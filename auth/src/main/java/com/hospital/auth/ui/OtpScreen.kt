package com.hospital.auth.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hospital.auth.AuthViewModel

@Composable
fun OtpScreen(navController: NavHostController,authViewModel: AuthViewModel= hiltViewModel()) {
    var email by remember { mutableStateOf("pramod") }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Hello", color = Color.Red)
    }
}


@Preview(showBackground = true)
@Composable
fun priviewOtpScreen(){
    val navController = rememberNavController()
    OtpScreen(navController)

}
