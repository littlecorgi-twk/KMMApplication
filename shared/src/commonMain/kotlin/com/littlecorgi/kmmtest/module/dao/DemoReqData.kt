package com.littlecorgi.kmmtest.module.dao

import kotlinx.serialization.Serializable

@Serializable
data class DemoReqData(
    val `data`: Data,
    val errorCode: Int,
    val errorMsg: String
)