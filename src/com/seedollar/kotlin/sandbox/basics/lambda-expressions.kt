package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    val names = arrayOf("terry", "meg", "jerry", "larry", "mary", "sabastian", "barry")

    names.filter { it.length > 4 }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach {
                println(it)
            }
}