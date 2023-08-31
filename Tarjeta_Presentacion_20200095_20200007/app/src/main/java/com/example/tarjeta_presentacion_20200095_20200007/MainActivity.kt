package com.example.tarjeta_presentacion_20200095_20200007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta_presentacion_20200095_20200007.ui.theme.Tarjeta_Presentacion_20200095_20200007Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta_Presentacion_20200095_20200007Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta_Presentacion()
                }
            }
        }
    }
}

@Composable
fun Tarjeta_Presentacion() {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 210, green = 232, blue = 212)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(
            modifier = Modifier
                .size(150.dp) // Tamaño de la caja que contiene la imagen
                .background(Color(red = 7, green = 48, blue = 66)) // Color de fondo de la caja
        ) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )
        }
        Text(
            text = "Jennifer Doe",

            modifier = Modifier,
            fontSize = 40.sp
        )

        Text(
            text = "Android Development Extraordinaire",
            fontSize = 16.sp
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            val image = painterResource(id = R.drawable.telefono)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(20.dp).weight(1.5f)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "+11 (123) 444 555 666",
                fontSize = 16.sp,
                modifier = Modifier.weight(3f)
            )
        }
        Row(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            val image = painterResource(id = R.drawable.share)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(20.dp).weight(1.5f)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "@Luis_Ivan",
                fontSize = 16.sp,
                modifier = Modifier.weight(3f)
            )
        }
        Row(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 40.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            val image = painterResource(id = R.drawable.email)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(30.dp).weight(1.5f)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Codelabs@unmsm.edu.pe",
                fontSize = 16.sp,
                modifier = Modifier.weight(3f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarjeta_Presentacion_20200095_20200007Theme {
        Tarjeta_Presentacion()
    }
}