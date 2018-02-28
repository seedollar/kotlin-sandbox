package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    /**
     * Local function definition
      */
    fun isEven(num: Int): Boolean = num % 2 == 0

    for (n in arrayOf(11,12,13,14,15))
        println("num: $n - ${isEven(n)}")
}