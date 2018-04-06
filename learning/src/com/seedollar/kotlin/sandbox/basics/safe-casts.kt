package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    val locked : Boolean = true

    val number = locked as? Int

    // Should be null, because the safe cast failed
    println(number)


}