package com.example.grammaticalinflectionapidemo

import android.app.GrammaticalInflectionManager
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var submitButton: Button
    private lateinit var spinner: Spinner
    private lateinit var selectedGender: String


    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.username_et)
        submitButton = findViewById(R.id.submit_button)
        spinner = findViewById(R.id.spinner)

        /// initialize Grammatical Inflection Service
        val gim = getSystemService(GrammaticalInflectionManager::class.java) as GrammaticalInflectionManager

        /// Spinner setup
        val genderList = resources.getStringArray(R.array.gender_list)
        val genderAdapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, genderList)
        spinner.adapter = genderAdapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
                selectedGender = genderAdapter.getItem(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        /// Setting up Grammatical Gender based on selected Gender From spinner
        submitButton.setOnClickListener {
            if (usernameEditText.text.isNotEmpty()) {
                when (selectedGender) {
                    genderList[0] -> {
                        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_MASCULINE)
                    }

                    genderList[1] -> {
                        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_FEMININE)
                    }

                    genderList[2] -> {
                        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_NEUTRAL)
                    }
                }

                Timer().schedule(100) {
                    startActivity(Intent(this@MainActivity, SecondActivity::class.java))
                }
            }
            else{
                Toast.makeText(this@MainActivity, "Please enter username", Toast.LENGTH_SHORT).show()
            }
        }
    }
}