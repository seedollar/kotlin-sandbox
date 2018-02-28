package com.seedollar.kotlin.sandbox.basics

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {

    val set9to12 = arrayOf(9, 10, 11, 12)

    fun designation(points: Int): String {
        when (points) {
            1,2,3 -> return "$points = Loser"
            4,5 -> return "$points = Average"
            7,8 -> return "$points = Good"
            in set9to12 -> return "$points = between 9 and 12"
            !in 20..25 -> return "not between 20 and 25"
            else -> return "$points = Unknown"
        }
    }

    println(designation(1))
    println(designation(4))
    println(designation(8))
    println(designation(10))
    println(designation(15))
    println(designation(24))

    // Use when as an expression
    fun isNumeric(obj: Any?) = when(obj) {
        is String -> false
        else -> true
    }

    println(isNumeric(45))
    println(isNumeric(5.54))
    println(isNumeric(true))
    println(isNumeric(null))
    println(isNumeric("seven"))

    val counter = ThreadLocalRandom.current().nextInt()

    // when as a if-else if expression
    when {
        counter % 2 == 0 -> println("$counter = Even")
        counter % 2 != 0 -> println("$counter = Odd")
        else -> println("$counter = Negative")
    }




}