package com.example.myapplicati

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("ControlFlowWithEmptyBody")
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput: EditText = findViewById<EditText>(R.id.ageInput)
        val resultText: TextView = findViewById<TextView>(R.id.resultText)
        val generateBtn: Button = findViewById<Button>(R.id.generateBtn)
        val btnClear: Button = findViewById<Button>(R.id.btnClear)

        generateBtn.setOnClickListener() {
            val age = ageInput.text.toString().toInt()

            if (age <20 || age >100){
                resultText.text = "The number you have entered is out of range."
            } else if (age == 95) {
                resultText.text = "Nelson Mandela,the first Black President in South Africa"
            } else if (age == 52) {
                resultText.text = "William Shakespeare, history's greatest poet"
            } else if (age == 56) {
                resultText.text = "Abraham Lincoln, ended slavery in America"
            } else if (age == 76) {
                resultText.text = "Stephen Hawking, one of the world greatest theoretical physicists"
            } else if (age == 50) {
                resultText.text = "Chris Hani, South African activist during Apartheid"
            } else if (age == 69) {
                resultText.text = "Muammar Gaddafi, former ruler of Libiya"
            } else if (age == 39) {
                resultText.text = "Martin Luther King,fought for the rights of black people in america"
            } else if (age == 36) {
                resultText.text = "Princess Diana, member of the british royal family"
            } else if (age == 78) {
                resultText.text = "Mahatma Gandhi, Indian Anti Colonist and Lawyer"
            } else if (age == 60) {
                resultText.text = "Diego Maradona, Hand of GOD"
            } else
                resultText.text= "No specific person has been found try entering a different number"

                btnClear.setOnClickListener{
                    val currentName= resultText.text.toString()
                    resultText.text=""
                    ageInput.text.clear()


                }


        }

    }

}

