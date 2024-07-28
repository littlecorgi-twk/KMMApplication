package com.littlecorgi.kmmtest.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.littlecorgi.kmmtest.module.dao.DataX

@Composable
fun ListItem(data: DataX, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(80.dp)
            .padding(5.dp)
    ) {
        Text(text = data.title)
    }
}