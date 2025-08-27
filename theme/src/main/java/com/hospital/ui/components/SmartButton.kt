package com.hospital.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
@Preview(showBackground =true)
fun SmartButton( ){
    Button(onClick = {}) {
        Text( text = "Hello")
    }
}

@Preview(showBackground = true)
@Composable
fun SmartButtonEnabledPreview() {
    SmartButton()
}
