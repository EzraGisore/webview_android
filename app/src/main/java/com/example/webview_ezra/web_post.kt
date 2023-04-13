package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_post : AppCompatActivity() {
    lateinit var webpost: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_post)

        webpost = findViewById(R.id.web_post)
        val webSettings = webpost.settings
        webSettings.javaScriptEnabled = true
        webpost.loadUrl("https://www.postbank.co.ke")
    }
}