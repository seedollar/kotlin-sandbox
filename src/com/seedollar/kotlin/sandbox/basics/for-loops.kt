package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val numbers = arrayOf(2,4,6,8,10)

    for (n in numbers)
        println(n)

    for (num: Int in numbers) {
        val newnum = num * 10
        println(newnum)
    }

    for (i in numbers.indices) {
        println("index: $i | value = ${numbers[i]}")
    }

    for ((idx,v) in numbers.withIndex())
        println("idx: $idx || v = $v")
}