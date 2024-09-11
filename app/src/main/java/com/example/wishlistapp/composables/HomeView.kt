package com.example.wishlistapp.composables

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun HomeView() {

    Scaffold(topBar = {
        AppBarView(title = "WishList")
    }) { innerPadding ->

        val innerPadding = innerPadding
    }
}