package com.example.wishlistapp.composables

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.wishlistapp.R

private val WISHLIST: String = "WishList"

@Composable
fun AppBarView(
    title: String,
    onBackNavCicked: () -> Unit = {}
) {

    val navigationIcon: (@Composable () -> Unit)? = {

        if (!title.equals(WISHLIST)) {
            IconButton(onClick = { onBackNavCicked() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        } else {
            null
        }
    }


    TopAppBar(
        title = { Text(text = title, color = colorResource(id = R.color.white)) },
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon = navigationIcon

    )
}