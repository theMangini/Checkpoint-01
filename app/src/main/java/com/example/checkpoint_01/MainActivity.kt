package com.example.checkpoint_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var intentCalculadora = Intent(this, CalculadoraActivity::class.java)
        var intentContaTelefonica = Intent(this, ContaTelefonicaActivity::class.java)

        btnContaTel.setOnClickListener{
            startActivity(intentContaTelefonica)
        }

        btnCalculadora.setOnClickListener {
            startActivity(intentCalculadora)
        }

        btnIntegrantes.setOnClickListener{
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Desenvolvido por ")
            alertDialog.setMessage("""
                |Everton Souza Silva
                |Gustavo Mangini Rufino Guedes
                |Arthur Silva Borges
            """.trimMargin("|"))
            alertDialog.setPositiveButton("OK", null)
            alertDialog.create().show()
        }
    }
}