package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    // Declaration of a function type
    val isExpired: (Int) -> Boolean = { time -> time > 10 }

    println(isExpired(100))
    println(isExpired(6))
}