package com.littlecorgi.kmmtest.module

import com.littlecorgi.kmmtest.module.dao.DataX
import com.littlecorgi.kmmtest.module.dao.DemoReqData
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class HttpUtil {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    /**
     * 获取数据
     */
    suspend fun getData(): List<DataX> {
        val rockets: DemoReqData = httpClient.get(Api.dataApi).body()
        return rockets.data.datas
    }
}