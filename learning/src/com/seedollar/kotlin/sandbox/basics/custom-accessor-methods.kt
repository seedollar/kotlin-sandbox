package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    var priceOne = Price()
    priceOne.bonus = true
    println(priceOne.display)

    // Compiler will complain because setter method is private scope
//    priceOne.secret = "not a secret"
}

class Price {
    var display : String = ""

    var bonus : Boolean
        // custom accessor methods
        get() = this.bonus
        set(value) {
            this.display = addPrefix("WithBonus")
        }

    var secret : String = "a secret"
        private set

    fun addPrefix(inValue: String) : String = "Pre" + inValue
 }