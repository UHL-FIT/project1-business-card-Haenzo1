package com.example.bai_tap_danh_thiep_vunguyenduchai_cnttk1b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bai_tap_danh_thiep_vunguyenduchai_cnttk1b.ui.theme.Bai_tap_danh_thiep_VuNguyenDucHai_cnttk1bTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bai_tap_danh_thiep_VuNguyenDucHai_cnttk1bTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessCard(name = "Vũ Nguyễn Đức Hải")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        androidx.compose.foundation.layout.Spacer(modifier = Modifier.weight(1f))
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(8.dp)
                    .size(200.dp)
            )
            Text(text = "Vũ Nguyễn Đức Hải",
                fontSize = 40.sp)
            Text(text = "Android Developer",
                fontSize = 30.sp,
                color = Color(0xFF3ddc84),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 10.dp))
        }
        androidx.compose.foundation.layout.Spacer(modifier = Modifier.weight(1f))
        Column(modifier = Modifier.padding(bottom = 50.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            ContactRow(iconId = R.drawable.phone_icon, text = "0868962381")
            ContactRow(iconId = R.drawable.share_icon, text = "@VuNguyenDucHai")
            ContactRow(iconId = R.drawable.email_icon, text = "vunguyenduchai9@gmail.com")
        }
    }
}

@Composable
fun ContactRow(iconId: Int, text: String) {
    Row(
        modifier = Modifier.padding(start = 20.dp)
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = text,
            fontSize = 23.sp,
            modifier = Modifier.padding(start = 16.dp),
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Bai_tap_danh_thiep_VuNguyenDucHai_cnttk1bTheme {
        BusinessCard("Vũ Nguyễn Đức Hải")
    }
}