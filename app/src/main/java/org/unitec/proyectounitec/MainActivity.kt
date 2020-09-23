package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// El punto de partida de toda app es la MainActivity (Presenter)
class MainActivity : AppCompatActivity() {
    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)

        setContentView(R.layout.ejemplito)
    }
}