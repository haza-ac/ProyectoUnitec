package org.unitec.proyectounitec

import android.os.Bundle
import android.os.Vibrator
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService

class ComandoVozActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comando_voz)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            // ponemos a vibrar el cel por 3 seg
            var vi= getSystemService(VIBRATOR_SERVICE) as Vibrator
            vi.vibrate(3000)
        }
    }
}