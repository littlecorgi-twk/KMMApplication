package com.littlecorgi.kmmtest.component

import android.webkit.WebView

class AndroidWebView(private val webView: WebView) : IWebView {

    override fun loadUrl(url: String) {
        webView.loadUrl(url)
    }
}