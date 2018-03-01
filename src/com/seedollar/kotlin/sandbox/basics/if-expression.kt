package com.seedollar.kotlin.sandbox.basics

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    val num = ThreadLocalRandom.current().nextInt()
    val classification = if (num % 2 == 0) "Even" else "Odd"
    println("Number [$num] is: $classification")
}