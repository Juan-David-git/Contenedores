package me.juanbernal.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.juanbernal.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true) //Mostrar sistema
@Composable //Siempre colocarlo
fun ContentScreen() {
    Column(modifier = Modifier   //Columna fondo celeste
        .background(Color.Gray) // fondo gris
        .padding(all = 18.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Row(
            modifier = Modifier
                .background(Color.Cyan) //fondo celeste
                .fillMaxWidth() // tamaño color celeste rellena toda la columna
                .padding(all = 18.dp), //esquinas celestes
            horizontalArrangement = Arrangement.Center // coloca toda la fila en el centro

        ) {
            Text(
                text = "Inicio",
                modifier = Modifier.background(Color.Red)  //Caja roja
                    .padding(all = 8.dp)  //Tamaño de las cajas
            )
            Text(
                text = "Perfil",
                modifier = Modifier.background(Color.Yellow)
                    .padding(all = 8.dp)
            )
            Text(
                text = "Configuración",
                modifier = Modifier.background(Color.Green)
                    .padding(all = 8.dp)
            )
        }
        Text(
            text = "Encabezado",
            modifier = Modifier.background(Color.Red)  //Caja roja
                .padding(all = 8.dp)  //Tamaño de las cajas
        )
        Text(
            text = "Cuerpo",
            modifier = Modifier.background(Color.Red)  //Caja roja
                .padding(all = 8.dp)  //Tamaño de las cajas
        )
        Text(
            text = "Footer",
            modifier = Modifier.background(Color.Red)  //Caja roja
                .padding(all = 8.dp)  //Tamaño de las cajas
        )


    }
}

