package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val example = SecondaryConstructor(19,"tester")
}

class SecondaryConstructor constructor(name: String) {

    constructor(age: Int, name: String) : this(name) {
        println("name: $name, age: $age")
    }


}