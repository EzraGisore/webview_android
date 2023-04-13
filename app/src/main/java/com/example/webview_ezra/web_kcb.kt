package com.example.webview_ezra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web_kcb : AppCompatActivity() {
    lateinit var webkcb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        webkcb = findViewById(R.id.web_kcb)
        val webSettings = webkcb.settings
        webSettings.javaScriptEnabled = true
        webkcb.loadUrl("https://ke.kcbgroup.com")
    }
}