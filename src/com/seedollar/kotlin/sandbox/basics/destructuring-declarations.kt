package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val ngruben = Human("Nills", "Gruben")

    val (firstName, lastName) = ngruben

    print("\n$firstName")
    print("\n$lastName")

    val residents = arrayOf(Human("Fred", "Sanders"), Human("Becky", "Tilderson"), Human("Warren", "Ingrims"))

    for ((fn,ln) in residents) {
        print("\nfirst name: $fn, last name: $ln")
    }

}

// Given a data class which automatically creates componentN() [component1(), component2() ... methods) methods, we can use this class as a destructed declaration
data class Human(var firstName: String, var lastName: String) {
}

