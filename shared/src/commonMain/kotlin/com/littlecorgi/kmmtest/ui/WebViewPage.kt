package com.littlecorgi.kmmtest.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.littlecorgi.kmmtest.component.WebView
import com.littlecorgi.kmmtest.component.WebViewState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun WebViewPage(url: String) {
    MaterialTheme {
        val webViewState = remember {
            WebViewState().apply {
                this.url = url
            }
        }

        WebView(
            state = webViewState,
            modifier = Modifier.fillMaxSize()
        )
    }
}