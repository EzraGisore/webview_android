package com.example.webview_ezra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnkcb: Button
    lateinit var btncoop: Button
    lateinit var btnequ: Button
    lateinit var btnansa: Button
    lateinit var btnfam: Button
    lateinit var btnpost: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnkcb = findViewById(R.id.btn_kcb)
        btncoop = findViewById(R.id.btn_coop)
        btnequ = findViewById(R.id.btn_equ)
        btnansa = findViewById(R.id.btn_ansa)
        btnfam = findViewById(R.id.btn_fam)
        btnpost = findViewById(R.id.btn_post)

        btnkcb.setOnClickListener {
            // code to navigate from one activity to another
            val gotokcb = Intent(this, web_kcb::class.java)
            startActivity(gotokcb)
        }
        btncoop.setOnClickListener {
            // code to navigate from one activity to another
            val gotocoop = Intent(this, web_coop::class.java)
            startActivity(gotocoop)
        }
        btnequ.setOnClickListener {
            // code to navigate from one activity to another
            val gotoequ = Intent(this, web_equ::class.java)
            startActivity(gotoequ)
        }
        btnansa.setOnClickListener {
            // code to navigate from one activity to another
            val gotoabsa = Intent(this, web_absa::class.java)
            startActivity(gotoabsa)
        }
        btnfam.setOnClickListener {
            // code to navigate from one activity to another
            val gotofam = Intent(this, web_fam::class.java)
            startActivity(gotofam)
        }
        btnpost.setOnClickListener {
            // code to navigate from one activity to another
            val gotopost = Intent(this, web_post::class.java)
            startActivity(gotopost)
        }
    }
}