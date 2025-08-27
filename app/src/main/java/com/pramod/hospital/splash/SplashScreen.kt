package com.pramod.hospital.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pramod.hospital.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {


    LaunchedEffect( key1 = true) {
        delay(3000)

        navController.navigate("LoginScreen"){
            popUpTo("SplashScreen") { inclusive = true }
        }



    }




    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {

        Image(
            painter = painterResource(id = R.drawable.splesh),
            contentDescription = "Splash",
            modifier = Modifier.size(200.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun SplashScreenpreview() {
    val navController = rememberNavController()
    SplashScreen(navController = navController)
}
