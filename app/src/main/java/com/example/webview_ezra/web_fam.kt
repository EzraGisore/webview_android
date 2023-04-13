package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_fam : AppCompatActivity() {
    lateinit var webfam: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_fam)

        webfam = findViewById(R.id.web_fam)
        val webSettings = webfam.settings
        webSettings.javaScriptEnabled = true
        webfam.loadUrl("https://familybank.co.ke")
    }
}