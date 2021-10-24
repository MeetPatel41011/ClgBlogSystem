package com.example.clgblogsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun gotopage2() {

            val intent = Intent(this, page2::class.java).apply {

            }
            startActivity(intent)




        }
        var buttonlogin: Button = findViewById(R.id.button)
        buttonlogin.setOnClickListener(View.OnClickListener {
            gotopage2()
            })
    }
}