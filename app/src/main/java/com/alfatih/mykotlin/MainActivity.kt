package com.alfatih.mykotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {

            rollDice()

        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val luckyNumber: Int = 6
        val resultTextView: TextView = findViewById(R.id.digit_textView)
//        if(diceRoll == 6){
//
//            Toast.makeText(this, "You win!", Toast.LENGTH_SHORT).show()
//        }else{
//            "you do not win yet!".also { resultTextView.text = it }
//        }

        when(diceRoll){
            luckyNumber -> {
                resultTextView.text = diceRoll.toString()
                Toast.makeText(this, "You win!", Toast.LENGTH_SHORT).show()
            }
            else -> "you do not win yet!".also { resultTextView.text = it }

        }

    }
}