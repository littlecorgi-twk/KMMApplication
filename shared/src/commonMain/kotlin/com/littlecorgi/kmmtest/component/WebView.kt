package com.littlecorgi.kmmtest.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class WebViewState() {
    var url: String? by mutableStateOf(null)
    var webView: IWebView? by mutableStateOf(null)
}

@Composable
fun WebView(
    state: WebViewState,
    modifier: Modifier = Modifier,
    onCreated: () -> Unit = {},
    onDispose: () -> Unit = {},
) {
    ActualWebView(
        state = state,
        modifier = modifier,
        onCreated = onCreated,
        onDispose = onDispose,
    )
}
