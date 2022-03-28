package com.example.checkpoint_01

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class IntegrantesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.integrantes_activity)

        btnIntegrantes.setOnClickListener{
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Desenvolvido por ")
            alertDialog.setMessage("""
                |Everton Souza Silva
                |Gustavo Mangini Rufino Guedes
                |Arthur Silva Borges
            """.trimMargin("|"))
            alertDialog.setPositiveButton("OK", null)
        }
    }
}