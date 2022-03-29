package com.example.checkpoint_01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.resultado_conta_telefonica_activity.*

class ResultadoContaTelefonicaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado_conta_telefonica_activity)

        resultadoAssinatura.text = intent.getStringExtra("valorAssinatura")
        resultadoCelular.text = intent.getStringExtra("valorChamadaCelular")
        resultadoLocal.text = intent.getStringExtra("valorChamadaLocal")
        resultadoValorTotal.text = intent.getStringExtra("valorTotal")
    }
}