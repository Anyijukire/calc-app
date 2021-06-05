package com.example.calcc

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1=findViewById<EditText>(R.id.etNum1)
        val etNum2=findViewById<EditText>(R.id.etNum2)
        val btnStr=findViewById<Button>(R.id.btnstar)
        val btnPls=findViewById<Button>(R.id.btnPls)
        val btnMod=findViewById<Button>(R.id.btnMod)
        val btnMin=findViewById<Button>(R.id.btnMin)
        var tvAnswer=findViewById<TextView>(R.id.tvAnswer)


        btnMin.setOnClickListener {
           var Num1= etNum1.text.toString().toInt()
           var Num2 = etNum2.text.toString().toInt()
            var answer=Num1-Num2
            tvAnswer.text="Answer: $answer"

        }
        btnStr.setOnClickListener {
            var Num1= etNum1.text.toString().toInt()
            var Num2 = etNum2.text.toString().toInt()
            var answer=Num1*Num2
            tvAnswer.text=("Answer: $answer")

        }
        btnPls.setOnClickListener {
            var Num1= etNum1.text.toString().toInt()
            var Num2 = etNum2.text.toString().toInt()
            var answer=Num1+Num2
            tvAnswer.text="Answer: $answer"

        }
        btnMod.setOnClickListener {
            var Num1= etNum1.text.toString().toInt()
            var Num2 = etNum2.text.toString().toInt()
            var answer=Num1%Num2
            tvAnswer.text="Answer: $answer"

        }

    }


}
