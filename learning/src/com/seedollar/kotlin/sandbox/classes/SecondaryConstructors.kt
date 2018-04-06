package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val example = SecondaryConstructor(19,"tester")
    println(example.toString())
}

class SecondaryConstructor constructor(var name: String) {

    private var age: Int = 0

    constructor(age: Int, name: String) : this(name) {
        this.age = age
    }

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }


}