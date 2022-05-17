package com.example.ramdomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var coinButton : Button
    lateinit var diceButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        coinButton = findViewById(R.id.coin_menu)
        diceButton = findViewById(R.id.dice_menu)

        coinButton.setOnClickListener {

            val coinIntent = Intent(this, CoinActivity::class.java)
            startActivity(coinIntent)
        }

        diceButton.setOnClickListener {

            val diceIntent = Intent(this, DiceActivity::class.java)
            startActivity(diceIntent)
        }
    }
}