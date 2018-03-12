package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    // If we want to return from a lambda expression, we need to use label
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach lambdaEach@ {
        if (it == 3)
            return@lambdaEach
        println(it)
    }
    // We don't print number 3 because we returned to the lambda foreach label

    // alternatively, we can use an anonymous function to return correctly
    numbers.forEach(fun(num: Int) {
        if (num == 3)
            return
        println(num)
    })
}