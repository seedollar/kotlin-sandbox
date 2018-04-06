package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    // You can ignore unused lambda parameters by specifying an "_" character
    val applyTax: (Double, Boolean) -> Double = {amount, _ -> amount.times(0.13)}

    println(applyTax(97.63, false))

}