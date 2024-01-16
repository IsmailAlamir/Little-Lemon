package com.example.littlelemon

interface Destinations {
    val route: String
}

object Home : Destinations {
    override val route = "Home"
}
object AboutUs : Destinations {
    override val route = "AboutUs"
}


object DishDetails : Destinations {
    override val route = "Menu"
    const val argDishId = "dishId"
}
