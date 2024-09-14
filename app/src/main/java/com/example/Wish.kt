package com.example

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(0, "100k Salary", "Employed making 100+ a year"),
        Wish(1, "Purple Belt", "Belt Promotion"),
        Wish(2, "Challenger", "Own a Challenger")

    )
}