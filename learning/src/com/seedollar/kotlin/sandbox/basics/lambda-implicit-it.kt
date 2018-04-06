package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    // Kotlin allows you to implicitly reference single parameter lambda name as "it"
    val calculatePrice: (Double) -> Double = {it.times(100)}

    println(calculatePrice(89.2))
}