package com.example.randomdice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.randomdice2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.btndice.setOnClickListener {
            Toast.makeText(this,"버튼 작동",Toast.LENGTH_SHORT).show()


            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            Log.d("test1", number1.toString())
            Log.d("test2", number2.toString())

            if(number1 ==1){
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if(number1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if(number1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if(number1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if(number1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)
            } else{
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if(number2 ==1){
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if(number2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if(number2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if(number2 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if(number2 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            } else{
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }

        /*val btn_dice = findViewById<Button>(R.id.btn_dice)

        btn_dice.setOnClickListener {
            Toast.makeText(this,"버튼 작동",Toast.LENGTH_SHORT).show()*/
        }
    }
