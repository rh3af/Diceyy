package com.example.diceyy

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Dice(private val numsides :Int){
    fun roll(): Int{
        return(1..numsides).random() // generating random number
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.buttonny) // finding button by id

        rollButton.setOnClickListener {

            val dice1 = Dice(6) //Dice object 1
            val dice2 = Dice(6) // Dice object 2
            //A76A6A - color of the svg used for dice

            val dice1Result = dice1.roll().toString()  // converting number to string
            val dice2Result = dice2.roll().toString()  // converting number to string
            val tring = "$dice1Result  and  $dice2Result" // Concatenating both results
            println("Dice1 rolled $dice1Result and Dice2 rolled $dice2Result") //printing on logcat

            val resultTextView : TextView = findViewById(R.id.textView)
            resultTextView.text = tring //Setting value of Textview to two results




            if( dice1Result == dice2Result) {
                val toasty = Toast.makeText(this, "You got lucky!", Toast.LENGTH_SHORT).show() // Making a toast

                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator // Code for vibration effect
                if (vibrator.hasVibrator()) { // Vibrator availability checking
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        vibrator.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                    } else {
                        vibrator.vibrate(300) // Vibrate method for below API Level 26
                    }
                }
            }

        }
    }
}