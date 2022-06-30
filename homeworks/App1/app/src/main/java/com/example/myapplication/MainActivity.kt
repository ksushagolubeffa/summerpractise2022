package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var name: EditText? = null
    private var weight: EditText? = null
    private var height: EditText? = null
    private var age: EditText? = null
    private var button: Button? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.txt)
        button = findViewById(R.id.button)
        name = findViewById(R.id.name)
        height = findViewById(R.id.height)
        weight = findViewById(R.id.weight)
        age = findViewById(R.id.age)
        button?.setOnClickListener {
            val name1: String = name?.text.toString()
            val age1: String = age?.text.toString()
            val height1: String = height?.text.toString()
            val weight1: String = weight?.text.toString()
            try{ if (name1.length >= 50 || age1.toInt() !in 1..150 || height1.toInt() !in 1..250
                || weight1.toDouble() <= 0.0 || weight1.toDouble() >= 250.0
                || name1 == "") {
                    textView?.text = "Данные введены некорректно"}
                else {
                    var count: Double = name1.length + age1.toInt() + height1.toInt() + weight1.toDouble()
                    textView?.text = "Ответ: $count"
                }
            } catch(e: NumberFormatException){
                textView?.text = "Данные введены некорректно"
            }
        }
    }
}

