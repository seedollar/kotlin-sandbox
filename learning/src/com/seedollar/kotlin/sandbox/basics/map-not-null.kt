package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    val names = listOf("Gary", null, "Jermain", "Henry", null, "Bob")

    // Filter out any null names in the list
    val nonNullNameLengths = names.mapNotNull { it?.length }

    for (nameLengths in nonNullNameLengths) {
        println(nameLengths)
    }
}