package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var maintextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        maintextView = findViewById(R.id.textView)
    }

    fun getRandomNumber(view: View){
        val  randomInt =(1..6).random()
        maintextView.text = randomInt.toString()
    }
}