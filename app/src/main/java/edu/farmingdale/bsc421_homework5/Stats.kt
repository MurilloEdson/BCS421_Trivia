package edu.farmingdale.bsc421_homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Stats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        val statement = findViewById<TextView>(R.id.stat)
        val again = findViewById<Button>(R.id.play)
        var start = Intent(this,Question1::class.java)
        var score:Int = intent.getIntExtra("total",0)
        statement.setText("You received $" + score + " / $700")
        again.setOnClickListener{
            startActivity(start)
        }
    }
}