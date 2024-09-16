package com.example.wishlistapp.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wishlistapp.R
import com.example.wishlistapp.viewmodel.WishViewModel

@SuppressLint("ResourceType")
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
            } else stringResource(id = R.string.add_wish),

            onBackNavCicked = {
               navController.navigateUp()
            }
        )
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            WishTextField(label = "Title", value = wishViewModel.wishTitleState, onValueChanged = {
                wishViewModel.onWishTitleChanged(it)
            })

            WishTextField(
                label = "Description",
                value = wishViewModel.wishDescriptionState,
                onValueChanged = {
                    wishViewModel.onWishDescriptionChanged(it)
                })

            Button(onClick = {

                if(wishViewModel.wishTitleState.isNotEmpty() && wishViewModel.wishDescriptionState.isNotEmpty()){
                    //TODO Update Wish
                }
                else{
                    // TODO Add Wish
                }

            },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.app_bar_color)
                )) {
                Text(
                    text = if (id == 0L) stringResource(id = R.string.update_wish) else stringResource(
                        id = R.string.add_wish
                    ),
                    style = TextStyle(fontSize = 18.sp,
                        color = Color.White
                    )
                )
            }
        }

    }
}