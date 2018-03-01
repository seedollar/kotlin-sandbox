package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    val amts = doubleArrayOf(94.56, 334.34, 329.0, 3.6, 44.62)
    applyRates(amts, { it.times(0.13) })

    // We can define the lambda body after parenthesis if the last parameter in a high-order function is a lambda
    // for more readability
    checkStatus(amts) {
        it < 200
    }
}

fun applyRates(amounts: DoubleArray, taxRate: (Double) -> Double) {
    for (amount in amounts) {
        println("Amount: $amount @ 13% tax = ${taxRate(amount)}")
    }
}

fun checkStatus(amounts: DoubleArray, isLegal: (Double) -> Boolean) {
    for (amt in amounts) {
        println("Amount: $amt is: ${isLegal(amt)}")
    }
}