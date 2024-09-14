package com.example.wishlistapp.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wishlistapp.WishViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.Screen


@Composable
fun Navigation(viewModel: WishViewModel = viewModel(), navController: NavHostController = rememberNavController()){

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
            HomeView()
        }
    }
}