package edu.farmingdale.bsc421_homework5

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)
        val confirm = findViewById<Button>(R.id.confirm)
        val next = Intent(this,Question2::class.java)
        val rg = findViewById<RadioGroup>(R.id.answer_group)
        next.putExtra("total",0)
        rg.setOnCheckedChangeListener { radioGroup, i ->
            val checked = findViewById<RadioButton>(i)
            checked.setBackgroundColor(Color.GREEN)
        }

        confirm.setOnClickListener {
            var answer = getString(R.string.answer1)
            val selected = (rg.checkedRadioButtonId)
            val choice = findViewById<RadioButton>(selected).text
            if (choice == answer){
                next.putExtra("total",100)
                Toast.makeText(baseContext, R.string.correct, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(baseContext,R.string.incorrect,Toast.LENGTH_SHORT).show()
            }
            startActivity(next)
        }

    }
}