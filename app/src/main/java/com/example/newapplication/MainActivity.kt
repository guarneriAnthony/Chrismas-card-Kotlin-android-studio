package com.example.newapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {rollDice()}
        rollDice()
    }
    private fun rollDice(){
        val luckyNumber = 4
        val myFirstDice = Dice(6)
        val diceRoll = myFirstDice.roll()
        val resultTextView: TextView = findViewById(R.id.textView3)
        val resultImageView: ImageView = findViewById(R.id.imageView2)
        when (diceRoll){
            luckyNumber -> resultTextView.text = "You Win !"
            1 -> resultTextView.text = diceRoll.toString()
            2 -> resultTextView.text = diceRoll.toString()
            3 -> resultTextView.text = diceRoll.toString()
            5 -> resultTextView.text = diceRoll.toString()
            6 -> resultTextView.text = diceRoll.toString()
        }
        val drawableResource = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImageView.setImageResource(drawableResource)
        resultImageView.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}