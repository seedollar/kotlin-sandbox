package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    var sentence = "morp ot gniog"
    val modifiedSentence = "".reverseAndToUpper(sentence)
    println(modifiedSentence)

}

// Define an extension function on the String class
fun String.reverseAndToUpper(value: String): String {
    return value.reversed().toUpperCase()
}