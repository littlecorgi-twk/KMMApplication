package com.littlecorgi.kmmtest.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.littlecorgi.kmmtest.Greeting
import com.littlecorgi.kmmtest.module.HttpUtil
import com.littlecorgi.kmmtest.ui.App
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            App()
//            MyApplicationTheme {
////                Surface(
////                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colorScheme.background
////                ) {
////                    GreetingView(Greeting().greet())
////                }
//                Surface(
//                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
//                ) {
//                    Column() {
//                        val scope = rememberCoroutineScope()
//                        var text by remember { mutableStateOf("正在加载") }
//                        Button(onClick = {
//                            scope.launch {
//                                text = try {
//                                    HttpUtil().getData()
//                                } catch (e: Exception) {
//                                    e.localizedMessage ?: "error"
//                                }
//                                Log.i(TAG, "text=$text")
//                            }
//                        }) {
//                            Text(text = "请求数据")
//                        }
//                        GreetingView(Greeting(text).greet())
//                    }
//                }
//            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
