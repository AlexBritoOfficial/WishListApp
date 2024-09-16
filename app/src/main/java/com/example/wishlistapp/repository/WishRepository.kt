package com.example.wishlistapp.repository

import com.example.wishlistapp.model.Wish
import com.example.wishlistapp.model.WishDao
import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addWish(wish:Wish){
        wishDao.addWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getWish(id:Long){
        wishDao.getWish(id)
    }

    suspend fun updateWish(wish:Wish){
        wishDao.updateWish(wish)
    }

    suspend fun deleteWish(wish:Wish){
        wishDao.deleteWish(wish)
    }
}