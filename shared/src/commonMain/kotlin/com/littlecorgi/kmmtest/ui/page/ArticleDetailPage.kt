package com.littlecorgi.kmmtest.ui.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import com.littlecorgi.kmmtest.module.dao.DataX
import com.littlecorgi.kmmtest.ui.WebViewPage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun ArticleDetailPage(pageState: MutableState<Int>, currentArticle: MutableState<DataX?>) {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            WebViewPage(currentArticle.value?.link ?: "")
        }
    }
}