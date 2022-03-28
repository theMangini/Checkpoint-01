package com.example.checkpoint_01

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.calculadora_activity.*

class CalculadoraActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora_activity)

        btnCalcularNumero.setOnClickListener {
            var valor1 = editTextValor1.text.toString().toDouble()
            var valor2 = editTextValor2.text.toString().toDouble()

            var resultado = when(radioGroupCalculadora.checkedRadioButtonId){
                R.id.rdbSoma -> valor1 + valor2
                R.id.rdbSubtracao -> valor1 - valor2
                R.id.rdbMultiplicacao -> valor1 * valor2
                R.id.rdbDivisao -> valor1 / valor2
                else -> Toast.makeText(this, "Erro" , Toast.LENGTH_SHORT).show()
            }

            Toast.makeText(this, resultado.toString() , Toast.LENGTH_SHORT).show()
        }
    }
}