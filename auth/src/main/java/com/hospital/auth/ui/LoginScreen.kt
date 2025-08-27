package com.hospital.auth.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hospital.auth.AuthViewModel
import com.hospital.auth.R
import java.nio.file.WatchEvent


@Composable
fun LoginScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize().fillMaxHeight(50).padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Button(
            onClick = {}, modifier = Modifier.fillMaxWidth().padding(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue // background color of the button
            )
        ) {
            Text(
                text = "Login", fontSize = 25.sp,
                color = Color.White // text color
            )
        }


        /*Image(
            painter = painterResource(id = R.drawable.appsplesh),
            contentDescription = "null",
            modifier = Modifier.size(200.dp)
        )*/
    }

}


@Preview(showSystemUi = true,   showBackground = true)
@Composable
fun priviewLoginScreen(){
    val navController = rememberNavController()
    LoginScreen(navController)

}
