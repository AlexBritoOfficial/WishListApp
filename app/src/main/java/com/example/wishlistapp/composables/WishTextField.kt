package com.example.wishlistapp.composables

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun WishTextField(
    label: String,
    value: String,
    onValueChanged: (String) -> Unit
) {

    OutlinedTextField(value = value,
        onValueChange = onValueChanged,
        label = {Text(text = label)} )
}