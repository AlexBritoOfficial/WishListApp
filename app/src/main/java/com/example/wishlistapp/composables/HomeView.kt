package com.example.wishlistapp.composables

//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.wishlistapp.model.DummyWish
import com.example.wishlistapp.navigation.Screen
import com.example.wishlistapp.viewmodel.WishViewModel

@Composable
fun HomeView(wishViewModel: WishViewModel,
             navController: NavController) {

    Scaffold(topBar = {
        AppBarView(
            title = "WishList",
        )
    },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    /** TODO Navigation Functionality **/
                    navController.navigate(Screen.AddScreen.route)
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            items(DummyWish.wishList) {
                wish -> WishItem(wish = wish, {
                    navController.navigate(Screen.AddScreen.route)
            })
            }
        }
    }
}