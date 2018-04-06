package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    println("Kotlin Basics")
    println("Expression body function invocation: ${expressionSum(10, 6)}")
    expressionVariables(65, 5)
    functionWithDefaultValues("Slave") {println("before lambda slave")}
    functionWithDefaultValues("General", 50) {println("before lambda general")}
    functionWithDefaultValues(age = 74) {println("before lambda master")}
    varargsFunction("Nano", "Juno", "Buto")
    val names = arrayOf("John", "Candice", "Mark", "Judy")
    // Apply the "spread" (*) operator on an array to transform it to a varargs argument
    varargsFunction(*names)
    val returnTypeInferred = returnTypeInferred(4, 9)
    println(returnTypeInferred)
    println("Apply bonus: " + applyBonus(78))

}

/**
 * Function allocation
 */
fun expressionSum(num1: Int, num2: Int) = num1 + num2

/**
 * Function which illustrates the expression body referencing parameter variables
 */
fun expressionVariables(num1: Int, num2: Int) = println("$num1 + $num2 = ${num1 + num2}")

/**
 * This function has default values specified for missing parameter values
 * 1st parameter is String
 * 2nd parameter is Integer
 * 3rd parameter is lambda
 */
fun functionWithDefaultValues(name: String = "KotlinMaster", age: Int = 19, before: () -> Unit) = println("Hello $name I'm $age years old. ${before.invoke()}")

/**
 * Variable arguments function
 */
fun varargsFunction(vararg values: String) = println(values.forEach { value -> println(value) })

/**
 * The return type is inferred by the compiler
 */
fun returnTypeInferred(num1: Int, num2: Int) = num1 * num2

/**
 * Functions with block body need to explicitly return a value and cannot be inferred like Scala
 */
fun applyBonus(points: Int): Boolean {
    if (points > 70)
        return true
    return false
}

