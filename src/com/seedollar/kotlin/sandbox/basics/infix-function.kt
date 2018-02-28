package com.seedollar.kotlin.sandbox.basics

/**
 * Infix notation
 *
They must be member functions or extension functions;
They must have a single parameter;
The parameter must not accept variable number of arguments and must have no default value.
 */
fun main(args: Array<String>) {
    val number = 20
    println(number infixFunction 99)
}

/**
 * Define an extension function on the Int class called infixFunction which takes a single Int parameter and returns an Int.
 */
infix fun Int.infixFunction(num: Int): Int  = num * 100


