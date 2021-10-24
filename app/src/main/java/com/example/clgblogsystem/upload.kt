package com.example.clgblogsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button


class upload : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        fun gotohome() {

            val intent = Intent(this, page2::class.java).apply {

            }
            startActivity(intent)
        }
        var buttonhome: Button = findViewById(R.id.buttonhome)
        buttonhome.setOnClickListener(View.OnClickListener {
            gotohome()
        })
    }
}