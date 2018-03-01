package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    // Use apply to initialize the object instance
    val audi = Car().apply {
        model = "A3"
        make = "Audi"
        color = "Red"
        displayCar()
    }

}

data class Car(var color: String? = "white", var make: String = "Audi", var model :String = "Q5")  {
    fun displayCar(): Unit = println("Make: $make, Model: $model, Color: ${color ?: "White"}")
}