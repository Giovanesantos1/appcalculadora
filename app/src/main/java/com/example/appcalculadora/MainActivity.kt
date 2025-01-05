package com.example.appcalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtOneNumber = findViewById<TextInputEditText>(R.id.edt_one_number)
        val edtTwoNumber = findViewById<TextInputEditText>(R.id.edt_two_number)
        val btnSomar = findViewById<Button>(R.id.btn_somar)
        val btnDiminuir = findViewById<Button>(R.id.btn_diminuir)
        val btnMultiplicar = findViewById<Button>(R.id.btn_multiplicação)
        val btnDividir = findViewById<Button>(R.id.btn_divisão)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        btnSomar.setOnClickListener {
            val oneNumber: String = edtOneNumber.text.toString()
            val twoNumber: String = edtTwoNumber.text.toString()

            if (oneNumber == "" || twoNumber == "") {
                Snackbar.make(edtOneNumber,"Preencher todos os campos", Snackbar.LENGTH_LONG).show()
                Snackbar.make(edtTwoNumber,"Preencher todos os campos", Snackbar.LENGTH_LONG).show()

            } else {
                val oneNumber: Float = edtOneNumber.text.toString().toFloat()
                val twoNumber: Float= edtTwoNumber.text.toString().toFloat()

            val result = oneNumber + twoNumber
            println(result)

                tvResult.text = result.toString()
            }
        }

        btnDiminuir.setOnClickListener {
            val oneNumber: String = edtOneNumber.text.toString()
            val twoNumber: String = edtTwoNumber.text.toString()

            if (oneNumber == "" || twoNumber == "") {
                Snackbar.make(edtOneNumber,"Preencher todos os campos", Snackbar.LENGTH_LONG).show()

            } else {
                val oneNumber: Float = edtOneNumber.text.toString().toFloat()
                val twoNumber: Float= edtTwoNumber.text.toString().toFloat()

            val result = oneNumber - twoNumber
            println(result)

                tvResult.text = result.toString()
            }
        }

        btnMultiplicar.setOnClickListener {
            val oneNumber: String = edtOneNumber.text.toString()
            val twoNumber: String = edtTwoNumber.text.toString()

            if (oneNumber == "" || twoNumber == "") {
                Snackbar.make(edtOneNumber,"Preencher todos os campos", Snackbar.LENGTH_LONG).show()

            } else {
                val oneNumber: Float = edtOneNumber.text.toString().toFloat()
                val twoNumber: Float= edtTwoNumber.text.toString().toFloat()

                val result = oneNumber * twoNumber
                println(result)

                tvResult.text = result.toString()
            }
        }

        btnDividir.setOnClickListener {
            val oneNumber: String = edtOneNumber.text.toString()
            val twoNumber: String = edtTwoNumber.text.toString()

            if (oneNumber == "" || twoNumber == "") {
                Snackbar.make(edtOneNumber,"Preencher todos os campos", Snackbar.LENGTH_LONG).show()

            } else {
                val oneNumber: Float = edtOneNumber.text.toString().toFloat()
                val twoNumber: Float= edtTwoNumber.text.toString().toFloat()

                val result = oneNumber / twoNumber
                println(result)

                tvResult.text = result.toString()
            }
        }
    }
    }