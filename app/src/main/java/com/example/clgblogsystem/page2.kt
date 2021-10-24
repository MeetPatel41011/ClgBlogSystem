package com.example.clgblogsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        fun gotoupload() {

            val intent = Intent(this, upload::class.java).apply {

            }
            startActivity(intent)
        }
        var buttonupload: Button = findViewById(R.id.buttonupload)
        buttonupload.setOnClickListener(View.OnClickListener {
            gotoupload()
        })
    }
}