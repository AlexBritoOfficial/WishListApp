package com.example.wishlistapp.composables

import android.widget.Toast
import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.Wish

@Composable
fun HomeView() {

    Scaffold(topBar = {
        AppBarView(
            title = "WishList",
        )
    },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    /** TODO Navigation Functionality **/
                },
                modifier = Modifier.padding(all = 20.dp),
                contentColor = Color.White,
                backgroundColor = Color.Black
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = LocalContentColor.current
                )
            }
        }) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {

        }
    }
}