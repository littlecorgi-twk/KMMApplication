package com.littlecorgi.kmmtest.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.littlecorgi.kmmtest.module.dao.DataX
import com.littlecorgi.kmmtest.ui.page.ArticleDetailPage
import com.littlecorgi.kmmtest.ui.page.ArticleListPage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            val pageState = remember { mutableStateOf(0) }
            val currentArticle = remember { mutableStateOf<DataX?>(null) }
            when (pageState.value) {

                1 -> {
                    ArticleDetailPage(pageState, currentArticle)
                }

                else -> {
                    ArticleListPage(pageState, currentArticle)
                }
            }
        }
    }
}