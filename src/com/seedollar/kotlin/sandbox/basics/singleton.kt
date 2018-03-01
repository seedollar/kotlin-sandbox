package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    println(TaxUtils.calculateTax(100.00))
}

// Define a singleton using object keyword
object TaxUtils {
    fun calculateTax(amount: Double) = amount.times(0.13)
}