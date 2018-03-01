package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    val totalPrice : TaxedAmount = {it.times(0.13)}
    println(totalPrice(100.00))
}

// typealias for function type
typealias TaxedAmount = (Double) -> Double


