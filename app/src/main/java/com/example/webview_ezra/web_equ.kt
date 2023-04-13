package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_equ : AppCompatActivity() {
    lateinit var webequ: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_equ)

        webequ = findViewById(R.id.web_equ)
        val webSettings = webequ.settings
        webSettings.javaScriptEnabled = true
        webequ.loadUrl("https://equitygroupholdings.com")
    }
}