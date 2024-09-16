package com.example.wishlistapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    @ColumnInfo(name = "wish_title") val title: String = "",
    @ColumnInfo(name = "wish_description") val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(0, "100k Salary", "Employed making 100+ a year"),
        Wish(1, "Purple Belt", "Belt Promotion"),
        Wish(2, "Challenger", "Own a Challenger")

    )
}