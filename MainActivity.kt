package com.example.guardadatos3

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var cantidad:Double=0.0
    var kantidad:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonenviar.setOnClickListener {
            kantidad=micuadrocantidadEt.text.toString()
            cantidad=kantidad.toDouble()
            val miintent= Intent(this,CalculoActivity::class.java)
            miintent.putExtra(Konstantes.CANTIDAD,cantidad)
            startActivity(miintent)
            val pref: SharedPreferences =getSharedPreferences(Konstantes.MICANTIDAD, Context.MODE_PRIVATE)
            with(pref.edit()) {
                putString("claveString", micuadrocantidadEt.text.toString())

                commit()

            }
        }

            val prefe: SharedPreferences = getSharedPreferences(Konstantes.MICANTIDAD, Context.MODE_PRIVATE)
            //val valorString=getString(0)
            micuadrocantidadEt.setText(prefe.getString("claveString", ""))
        




    }
}