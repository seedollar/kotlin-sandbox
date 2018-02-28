package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    var stringValue : String? = "This is a string"

    stringValue = null

    // Use the "safe call operator (?.)" which checks if the variable is null, if not return the length.
    val stringLength = stringValue?.length
}