package com.example.appcalculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextInputEditText>(R.id.edt_one_number)
        findViewById<TextInputEditText>(R.id.edt_two_number)
        findViewById<Button>(R.id.btn_somar)
        findViewById<Button>(R.id.btn_diminuir)
        findViewById<Button>(R.id.btn_multiplicação)
        findViewById<Button>(R.id.btn_divisão)


    }
}