package com.example.babycalculator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btnDiv
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMul
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.btnlink
import kotlinx.android.synthetic.main.activity_main.input1
import kotlinx.android.synthetic.main.activity_main.input2
import kotlinx.android.synthetic.main.activity_main.tvResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnPlus.setOnClickListener{
            val box1=input1.text.toString().toFloat()
            val box2=input2.text.toString().toFloat()

            tvResult.text=(box1 + box2).toString()
        }

        btnMinus.setOnClickListener{
            val box1:Float=input1.text.toString().toFloat()
            val box2:Float=input2.text.toString().toFloat()

            tvResult.text=(box1 - box2).toString()
        }

        btnMul.setOnClickListener{
            val box1=input1.text.toString().toFloat()
            val box2:Float=input2.text.toString().toFloat()

            tvResult.text=(box1 * box2).toString()
        }


        btnDiv.setOnClickListener{
            val box1:Float=input1.text.toString().toFloat()
            val box2:Float=input2.text.toString().toFloat()

            tvResult.text=(box1 / box2).toString()
        }

        btnlink.setOnClickListener{
            Toast.makeText(this, "Redirecting to linkedIn",Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rishi-rih/")))
        }





    }
}
    