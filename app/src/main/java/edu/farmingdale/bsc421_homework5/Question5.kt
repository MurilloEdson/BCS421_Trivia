package edu.farmingdale.bsc421_homework5

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)
        var confirm = findViewById<Button>(R.id.confirm)
        var next = Intent(this,Question6::class.java)
        var totalText = findViewById<TextView>(R.id.total)
        val rg = findViewById<RadioGroup>(R.id.answer_group)
        var score:Int = intent.getIntExtra("total",0)
        totalText.setText("You Earned: $ " + score)
        rg.setOnCheckedChangeListener { radioGroup, i ->
            val checked = findViewById<RadioButton>(i)
            checked.setBackgroundColor(Color.GREEN)
        }
        confirm.setOnClickListener{
            var answer = getString(R.string.answer1)
            val selected = (rg.checkedRadioButtonId)
            val choice = findViewById<RadioButton>(selected).text
            if (choice == getString(R.string.answer5)){
                score += 100
                Toast.makeText(baseContext, R.string.correct, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(baseContext, R.string.incorrect, Toast.LENGTH_SHORT).show()
            }
            next.putExtra("total",score)
            startActivity(next)
        }
    }
}