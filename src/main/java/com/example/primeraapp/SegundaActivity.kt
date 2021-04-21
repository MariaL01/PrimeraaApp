package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    // Declaración de variables
    var contador = 0
    lateinit var btnInicio:Button
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var  tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Inicialización de las variables
        btnIncrementar = findViewById(R.id.btnIncrementar)
        btnDecrementar = findViewById(R.id.btn_Decrementar)
        btnInicio = findViewById(R.id.btnInicio)
        tvContador = findViewById(R.id.tvNumero)

        btnIncrementar.setOnClickListener {

                contador++
                tvContador.text = "$contador"
                if (!btnDecrementar.isEnabled){
                btnDecrementar.isEnabled = true
                }

        }
        btnDecrementar.setOnClickListener {
            if(contador>=1) {
                contador--
            }else{
                btnDecrementar.isEnabled = false

            }
            tvContador.text ="$contador"
        }
        btnInicio.setOnClickListener(View.OnClickListener {
            val miIntent3 = Intent(this, MainActivity::class.java)
            startActivity(miIntent3)

        })

    }
}