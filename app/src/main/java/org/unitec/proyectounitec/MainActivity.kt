package org.unitec.proyectounitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.ejemplito.*

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

        // Aqui vamos a introducir la primer parte de codigo verdaderamente de kotlin
            botoncito.setOnClickListener {
                // Declaramos una variable de tipo Intent
                var i= Intent(this,ComandoVozActivity::class.java)

                // Lo invocamos
                startActivity(i)

        }

    }
}