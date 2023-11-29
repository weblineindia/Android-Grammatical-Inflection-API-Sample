package com.example.grammaticalinflectionapidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textOne: TextView
    private lateinit var textTwo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textOne = findViewById(R.id.text_one)
        textTwo = findViewById(R.id.text_two)

        // Text view to display text based of gender
        textOne.text = getString(R.string.string_one)
        textTwo.text = getString(R.string.string_two)

    }
}