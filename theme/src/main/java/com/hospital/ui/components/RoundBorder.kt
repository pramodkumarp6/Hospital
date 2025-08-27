package com.hospital.ui.components

import android.R
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview(showBackground =true)
fun RoundBorder() {

    Box(modifier = Modifier.size(100.dp)
        .border(width = 1.dp,
            color = Color.Blue,
            shape = RoundedCornerShape(10.dp)
        )
    ){
        Text(text = "Rounded Border", modifier = Modifier.padding(8.dp))
    }

}