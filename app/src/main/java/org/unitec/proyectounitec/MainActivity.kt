package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// El punto de partida de toda app es la MainActivity (Presenter)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}