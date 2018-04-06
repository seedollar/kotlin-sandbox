package com.seedollar.kotlin.sandbox.fields

fun main(args: Array<String>) {
    val jarInstance = Jar(697)
    println(jarInstance.empty)
}

class Jar(private val contents: Int) {
    val empty get() = contents > 100 // Here the empty field's type is inferred by the getter method (boolean)
}