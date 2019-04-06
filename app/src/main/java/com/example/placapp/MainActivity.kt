package com.example.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.placapp.extesions.value
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btStart.setOnClickListener {

                val nextScreenIntent = Intent(this, GameActivity::class.java)

                nextScreenIntent.putExtra("Home", inputHome.value())
                nextScreenIntent.putExtra("Away", inputAway.value())

                startActivity(nextScreenIntent)
            }
    }
}
