package com.seedollar.kotlin.sandbox.fields

fun main(args: Array<String>) {
    val member = Member()
    println(member.price)
    member.price = 90.0
    println(member.price)
    member.price = 320.0
    println(member.price)
}

class Member{
    var price = 0.0
        set(value) {
            // the 'field' keyword can only be referenced here in the accessor
            if (value >= 100) field = value
        }
}