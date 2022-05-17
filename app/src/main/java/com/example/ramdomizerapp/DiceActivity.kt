package com.example.ramdomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DiceActivity : AppCompatActivity() {

    lateinit var rollButton : Button
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        rollButton = findViewById(R.id.dice_roll)
        diceImage = findViewById(R.id.image_dice)

        rollButton.setOnClickListener {

            var randomInt = (1..6).random()

            when (randomInt) {

                1 -> diceImage.setImageResource(R.drawable.alea1)
                2 -> diceImage.setImageResource(R.drawable.alea2)
                3 -> diceImage.setImageResource(R.drawable.alea3)
                4 -> diceImage.setImageResource(R.drawable.alea4)
                5 -> diceImage.setImageResource(R.drawable.alea5)
                6 -> diceImage.setImageResource(R.drawable.alea6)
            }
        }
    }
}