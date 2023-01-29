package com.example.navdemohand
import android.content.Intent

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Gesture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gesture)

        val gestures = resources.getStringArray(R.array.Gestures)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)

        val button: Button = findViewById(R.id.sent)

        fun send(position: Int) {
            button.setOnClickListener(View.OnClickListener {
                Toast.makeText(this@Gesture,gestures[position] + " sent!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@Gesture, MainActivity::class.java))
            })
        }

        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                    android.R.layout.simple_spinner_item, gestures)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                        send(position)
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}