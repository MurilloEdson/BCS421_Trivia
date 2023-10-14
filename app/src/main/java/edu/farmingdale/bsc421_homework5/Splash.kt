package edu.farmingdale.bsc421_homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var start = findViewById<Button>(R.id.start)
        var startInt = Intent(this,Question1::class.java)
        start.setOnClickListener{
            startActivity(startInt)
        }
    }
}