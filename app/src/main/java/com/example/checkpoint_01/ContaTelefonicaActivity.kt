package com.example.checkpoint_01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.conta_telefonica_activity.*
import kotlinx.android.synthetic.main.resultado_conta_telefonica_activity.*

class ContaTelefonicaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conta_telefonica_activity)

        var intentResultado = Intent(this, ResultadoContaTelefonicaActivity::class.java)


        btnCalcularCel.setOnClickListener{
            startActivity(intentResultado)
        }
    }
}