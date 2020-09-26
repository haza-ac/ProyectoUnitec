package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// El punto de partida de toda app es la MainActivity (Presenter)
class MainActivity : AppCompatActivity() {
    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)

        setContentView(R.layout.ejemplito)

        //vamos a eliminar la barra de la parte superior del celular, esta barra se conoce como
        // supportActionBar
        // compilador del celular se llama Dalvik (en java es la jvm)
        // Otra cosa hermosa de kotlin es que las sentencias no terminan en ;
        supportActionBar?.hide()

    }
}