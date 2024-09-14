package com.example.wishlistapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.Wish

class WishViewModel: ViewModel() {

    private val _wishes = mutableStateOf<List<Wish>?>(null)
    val wishes: State<List<Wish>?> = _wishes

}
