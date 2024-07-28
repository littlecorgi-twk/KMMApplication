package com.littlecorgi.kmmtest.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.littlecorgi.kmmtest.module.HttpUtil
import com.littlecorgi.kmmtest.module.dao.DataX
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            WebViewPage()
//             Column(
// //                modifier = Modifier.verticalScroll(rememberScrollState())
//             ) {
//                 val scope = rememberCoroutineScope()
// //                var text by remember { mutableStateOf("正在加载") }
//                 var data by remember { mutableStateOf<List<DataX>>(mutableListOf()) }
//                 Button(onClick = {
//                     scope.launch {
//                         data = try {
//                             HttpUtil().getData()
//                         } catch (e: Exception) {
//                             e.message ?: "error"
//                             emptyList()
//                         }
//                     }
//                 }) {
//                     Text(text = "请求数据")
//                 }
// //                Text(Greeting(text).greet())
//                 LazyColumn(Modifier.fillMaxSize()) {
//                     itemsIndexed(data) { index, d ->
//                         ListItem(d)
//                         if (index != data.size - 1) {
//                             Divider()
//                         }
//                     }
//                 }
//             }
        }
    }
}