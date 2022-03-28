package com.example.checkpoint_01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.conta_telefonica_activity.*

class ContaTelefonicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conta_telefonica_activity)

        var valorAssinatura = editTextAssintura.text.toString().toDouble()
        var minutosChamadaLocal = editTextMinutosChamadaLocal.text.toString().toDouble()
        var minutosChamadaCelular = editTextMinutosChamadaCelular.text.toString().toDouble()

        minutosChamadaLocal *= 0.04
        minutosChamadaCelular *= 0.20

        var total = valorAssinatura + minutosChamadaCelular + minutosChamadaLocal

        var intentResultado = Intent(this, ResultadoContaTelefonicaActivity::class.java)
        intent.putExtra("assinatura", valorAssinatura)
        intent.putExtra("minutosChamadaLocal", minutosChamadaLocal)
        intent.putExtra("minutosChamadaCelular", minutosChamadaCelular)
        intent.putExtra("total", total)

        btnCalcularCel.setOnClickListener {
            startActivity(intentResultado)
        }
    }
}