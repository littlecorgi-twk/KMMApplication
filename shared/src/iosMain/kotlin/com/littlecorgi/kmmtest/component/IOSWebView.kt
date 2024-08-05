package com.littlecorgi.kmmtest.component

import platform.Foundation.NSMutableURLRequest
import platform.Foundation.NSURL
import platform.WebKit.WKWebView

class IOSWebView(private val wkWebView: WKWebView) : IWebView {

    override fun loadUrl(url: String) {
        wkWebView.loadRequest(NSMutableURLRequest.requestWithURL(NSURL(string = url)))
    }
}