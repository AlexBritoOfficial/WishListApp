package com.example.wishlistapp.composables

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.wishlistapp.R
import com.example.wishlistapp.WishViewModel

@Composable
fun AddEditDetailView(
    id: Long,
    wishViewModel: WishViewModel,
    navController: NavController
) {

    Scaffold(topBar = {
        AppBarView(
            title =
            if (id != 0L) {
                stringResource(id = R.string.update_wish)
            } else stringResource(id = R.string.add_wish)

        )
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(10.dp))
        }

    }
}