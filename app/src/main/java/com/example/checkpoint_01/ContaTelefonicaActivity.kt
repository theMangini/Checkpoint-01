package com.example.checkpoint_01

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.conta_telefonica_activity.*
import kotlinx.android.synthetic.main.resultado_conta_telefonica_activity.*

class ContaTelefonicaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conta_telefonica_activity)

        var intentResultado = Intent(this, ResultadoContaTelefonicaActivity::class.java)


        btnCalcularCel.setOnClickListener{
            var valorAssinatura = editTextAssinatura.text.toString().toDouble()
            var valorChamadaLocal = editTextMinutosChamadaLocal.text.toString().toDouble()
            var valorChamadaCelular = editTextMinutosChamadaCelular.text.toString().toDouble()

            valorChamadaLocal *= 0.04
            valorChamadaCelular *= 0.20

            var valorTotal = valorAssinatura + valorChamadaLocal + valorChamadaCelular

            intentResultado.putExtra("valorAssinatura", "R$ ${valorAssinatura.toString()}")
            intentResultado.putExtra("valorChamadaLocal", "R$ ${valorChamadaLocal.toString()}")
            intentResultado.putExtra("valorChamadaCelular", "R$ ${valorChamadaCelular.toString()}")
            intentResultado.putExtra("valorTotal", "R$ ${valorTotal.toString()}")

            startActivity(intentResultado)
        }
    }
}