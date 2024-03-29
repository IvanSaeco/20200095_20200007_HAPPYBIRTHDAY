package com.example.cuadrantecompose_20200095_20200007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose_20200095_20200007.ui.theme.CuadranteCompose_20200095_20200007Theme

// Desarrollado por Ivan Saenz y Luis Mayta.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteCompose_20200095_20200007Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {


        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.titulo_a),
                description = stringResource(R.string.descripcion_a),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            ComposableInfoCard(
                title = stringResource(R.string.titulo_b),
                description = stringResource(R.string.descripcion_b),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }


        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.titulo_c),
                description = stringResource(R.string.descripcion_c),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            ComposableInfoCard(
                title = stringResource(R.string.titulo_d),
                description = stringResource(R.string.descripcion_d),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier

) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3498DB)

        )

        Text(
            text = description,
            textAlign = TextAlign.Justify,
            color = Color(0xFF3498DB)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    CuadranteCompose_20200095_20200007Theme {
        ComposeQuadrantApp()
    }
}