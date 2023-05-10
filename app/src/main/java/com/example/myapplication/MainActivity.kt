package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//  Main: AppCompatActivity - Está herdando do AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount:TextView = findViewById(R.id.tvCount)
        val btToast =  findViewById<Button>(R.id.btToast)
        val btCount: Button = findViewById(R.id.btCount)

        var  contador = 0
        btToast.setOnClickListener {
            val value = if (contador > 0) "Contador: $contador" else "Hello Dayvid!!"
            Toast.makeText(applicationContext,value, Toast.LENGTH_LONG).show()
        }

        var funcao =  btCount.setOnClickListener {

                contador += 1
                tvCount.text = "$contador"


        }
    }
}