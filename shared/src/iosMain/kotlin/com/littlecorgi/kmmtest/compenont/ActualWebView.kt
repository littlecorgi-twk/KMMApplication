package com.littlecorgi.kmmtest.compenont

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import com.littlecorgi.kmmtest.component.WebViewState
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readValue
import platform.CoreGraphics.CGRectZero
import platform.WebKit.WKWebView
import platform.WebKit.WKWebViewConfiguration

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun ActualWebView(
    state: WebViewState,
    modifier: Modifier,
    onCreated: () -> Unit,
    onDispose: () -> Unit
) {
    UIKitView(
        factory = {
            WKWebView(
                frame = CGRectZero.readValue(),
                configuration = WKWebViewConfiguration()
            ).apply {
                onCreated()
            }.also {
                state.webView = IOSWebView(it).apply {
                    loadUrl(state.url ?: "")
                }
            }
        },
        modifier = modifier,
        onRelease = {
            onDispose()
        }
    )
}