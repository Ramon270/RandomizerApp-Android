package com.example.ramdomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CoinActivity : AppCompatActivity() {

    lateinit var flipButton : Button
    lateinit var coinImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        flipButton = findViewById(R.id.coin_flip)
        coinImage = findViewById(R.id.image_coin)

        flipButton.setOnClickListener {

            var randomInt = (1..2).random()

            if(randomInt == 1){

                coinImage.setImageResource(R.drawable.face)
            }
            else{
                coinImage.setImageResource(R.drawable.cross)
            }
        }
    }
}