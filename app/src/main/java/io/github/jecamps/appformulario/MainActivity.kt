package io.github.jecamps.appformulario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity :
    AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero1 =
            findViewById<EditText>(R.id.jnNumero1)
        val numero2 =
            findViewById<EditText>(R.id.jnNumero2)
        val button =
            findViewById<Button>(R.id.button)
        button.setOnClickListener { view ->
            val respuesta = (numero1.text.toString().toDouble() + numero2.text.toString().toDouble())
            Snackbar.make(
                view,
                "El resultado es: $respuesta.",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}