package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    var name : String? = "test"

    // Should print 4
    println(name!!.length)

    name = null
    // Should throw NPE
    println(name!!.length)
}