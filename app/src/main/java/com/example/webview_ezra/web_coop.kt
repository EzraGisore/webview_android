package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_coop : AppCompatActivity() {
    lateinit var webcoop: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_coop)

        webcoop = findViewById(R.id.web_coop)
        val webSettings = webcoop.settings
        webSettings.javaScriptEnabled = true
        webcoop.loadUrl("https://www.co-opbank.co.ke")
    }
}