package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val animal1 = Cat()
    val animal2 = Dog()
    println(animal1.speak())
    println(animal2.speak())
}

// Abstract classes are 'open' by default
abstract class Animal {
    abstract fun speak(): String
}

class Dog : Animal() {
    override fun speak(): String = "woof"
}

class Cat : Animal() {
    override fun speak(): String = "meow"

}