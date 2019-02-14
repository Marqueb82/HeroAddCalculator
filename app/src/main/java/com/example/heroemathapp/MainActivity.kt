 package com.example.heroemathapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) // lock application in portrait mode
        setContentView(R.layout.activity_main)

        addbutton.setOnClickListener {
            val intent = Intent(this, AddingActivity::class.java)
            startActivity(intent)
        }

    }


}
