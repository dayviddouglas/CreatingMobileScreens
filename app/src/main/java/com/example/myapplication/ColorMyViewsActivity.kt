package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class ColorMyViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)

        var itemEscolhido: TextView? =null

        val txviewOne:TextView = findViewById(R.id.textView1)
        val txviewTwo = findViewById<TextView>(R.id.textView2)
        val txviewThree = findViewById<TextView>(R.id.textView3)
        val txviewFour:TextView = findViewById(R.id.textView4)
        val txviewFive = findViewById<TextView>(R.id.textView5)

        val buttonRed : Button = findViewById(R.id.ButtonRed)
        val buttonBlue = findViewById<Button>(R.id.ButtonBlue)
        val buttonYellow =findViewById<Button>(R.id.ButtonYellow)


          txviewOne.setOnClickListener {
              itemEscolhido = txviewOne
          }
        txviewTwo.setOnClickListener {
            itemEscolhido = txviewTwo
        }
        txviewThree.setOnClickListener {
            itemEscolhido = txviewThree
        }
        txviewFour.setOnClickListener {
            itemEscolhido = txviewFour
        }
        txviewFive.setOnClickListener {
            itemEscolhido = txviewFive
        }

        buttonRed.setOnClickListener {
            val resColorRed = ContextCompat.getColor(this, R.color.red)
            itemEscolhido?.setBackgroundColor(resColorRed)
        }
        buttonBlue.setOnClickListener {
            val resColorBlue = ContextCompat.getColor(this, R.color.blue)
            itemEscolhido?.setBackgroundColor(resColorBlue)
        }

        buttonYellow.setOnClickListener {
            val resColorYellow = ContextCompat.getColor(this, R.color.yellow)
            itemEscolhido?.setBackgroundColor(resColorYellow)
        }

    }
}