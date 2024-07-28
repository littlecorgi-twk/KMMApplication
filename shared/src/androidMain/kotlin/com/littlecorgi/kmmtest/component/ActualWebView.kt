package com.littlecorgi.kmmtest.component

import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
actual fun ActualWebView(
    state: WebViewState,
    modifier: Modifier,
    onCreated: () -> Unit,
    onDispose: () -> Unit
) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                onCreated()
            }.also {
                state.webView = AndroidWebView(it).apply {
                    loadUrl(state.url ?: "")
                }
            }
        },
        modifier = modifier,
        onRelease = {
            onDispose()
        },
    )
}
