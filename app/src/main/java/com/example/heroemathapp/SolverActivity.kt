package com.example.heroemathapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_solver.*


class SolverActivity : AppCompatActivity() {

    private val charImage = arrayOf(R.drawable.catboy_correct, R.drawable.owlette_correct, R.drawable.gekko_correct,
        R.drawable.dillo_correct)
    private val badCharImage = arrayOf(R.drawable.romeo_wrong, R.drawable.ninga_wrong, R.drawable.luna_wrong, R.drawable.wolf_wrong)
    private val quotes = Quote()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solver)

        val numbOne = intent.getIntExtra("numOne",0)
        val numbTwo = intent.getIntExtra("numTwo",0)
        val answer = intent.getStringExtra("answer")

        checkAnswer(numbOne, numbTwo, answer.toInt())

        gobutton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        retrybutton.setOnClickListener{
            val intent = Intent(this, AddingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkAnswer(numbOne : Int, numbTwo : Int, answer : Int){

        val image : ImageView = findViewById(R.id.addImageView)
        val message : TextView = findViewById(R.id.answer_response)
        val random = (0..(charImage.size - 1)).random()

        if (numbOne + numbTwo == answer){
            image.setImageResource(charImage[random])
            message.text = quotes.getString()
        }else{
            image.setImageResource(badCharImage[random])
            message.text = quotes.getBadString()
        }
    }
}
