package com.example.helloworld

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.idspnElementos)

        val lista =
            listOf("Lenguaje de Preferencia", "JavaScript", "Java", "Kotlin", "Phyton", "HTML")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador


        val name = findViewById<EditText>(R.id.etName)
        val telephone = findViewById<EditText>(R.id.phone)
        val sendButton = findViewById<Button>(R.id.send)

        sendButton.setOnClickListener {
            val message = "Nombre : ${name.text}, Telefono : ${telephone.text}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        }

    }
}



