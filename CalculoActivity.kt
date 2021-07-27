package com.example.guardadatos3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculo.*

class CalculoActivity : AppCompatActivity() {
    var ahorro2:Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        ahorro2=intent.getDoubleExtra(Konstantes.CANTIDAD,0.0)
        ahorroEt.setText(ahorro2.toString())
    }
}