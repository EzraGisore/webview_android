package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_absa : AppCompatActivity() {
    lateinit var webansa: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_absa)

        webansa = findViewById(R.id.web_absa)
        val webSettings = webansa.settings
        webSettings.javaScriptEnabled = true
        webansa.loadUrl("https://ansabank.com")
    }
}