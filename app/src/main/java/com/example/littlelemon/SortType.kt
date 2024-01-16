package com.example.littlelemon

sealed class SortType {
    object Alphabetically : SortType()
    object PriceAsc : SortType()
    object PriceDesc : SortType()
}
