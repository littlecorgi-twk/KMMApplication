package com.littlecorgi.kmmtest.module.dao

import kotlinx.serialization.Serializable

@Serializable
data class Tag(
    val name: String,
    val url: String
)