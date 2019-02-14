package com.example.heroemathapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add.*

class AddingActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val num1text : TextView = findViewById(R.id.numOneView)
        val numOne = (0..100).random()
        num1text.text = numOne.toString()

        val num2text : TextView = findViewById(R.id.numTwoView)
        val numTwo = (0..100).random()
        num2text.text = numTwo.toString()


        addsubmitbutton.setOnClickListener {
            val intent = Intent(this@AddingActivity, SolverActivity::class.java)
            val submittedAnswer = answerText.text.toString()

            if(answerText.text.isBlank() || answerText.text.isEmpty()){
                Toast.makeText(applicationContext, "You forgot to put an answer!!!", Toast.LENGTH_SHORT).show()
            }
            else {
                intent.putExtra("numOne", numOne)
                intent.putExtra("numTwo", numTwo)
                intent.putExtra("answer", submittedAnswer)
                startActivity(intent)
            }
        }

    }
}
