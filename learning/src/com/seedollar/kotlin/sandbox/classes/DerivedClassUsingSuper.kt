package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {

    val test = Derived()
    println(test.process())

}

open class Base {
    val counter : Int = 32
    fun execute(): String = "base execution"
}

class Derived: Base() {
    fun process(): String = super.execute() + " in derived with counter = ${super.counter}"
}