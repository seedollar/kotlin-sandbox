package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val person1 = Person("John Clare", 54)
    val person2 = Person("Earl Heem", 24, true)
    val person3 = Person(35)

}

class Person constructor(name: String, age: Int, legal: Boolean = false) {
    // an init block is required for primary constructors
    init {
        println("Creating new person with name: $name and age: $age and has legal status: $legal")
    }

    constructor(name: String, age: Int) : this(name, age,false)

    constructor(age: Int) : this("John Doe", age, false)

    val personAge = age
    val fullName = name
}