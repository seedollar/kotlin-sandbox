package com.seedollar.kotlin.sandbox.fields

// We can define a const as a top level member
const val SIZE: Int = 97

fun main(args: Array<String>) {
    println(SIZE)
    println(Fixture.ERROR_CODE)
}

object Fixture {
    // We can define a const in object
    const val ERROR_CODE: String = "4987_ERR"
}

