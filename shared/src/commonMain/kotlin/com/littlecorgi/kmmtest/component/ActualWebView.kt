package com.littlecorgi.kmmtest.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun ActualWebView(
    state: WebViewState,
    modifier: Modifier = Modifier,
    onCreated: () -> Unit = {},
    onDispose: () -> Unit = {}
)