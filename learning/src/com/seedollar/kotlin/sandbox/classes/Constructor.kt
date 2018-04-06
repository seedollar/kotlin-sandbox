package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val constructEx1 : ConstructorExample = ConstructorExample("tag1")
    val constructEx2 : ConstructorExample2 = ConstructorExample2("tag1")

}

// class with primary constructor
class ConstructorExample constructor(tag: String) {
}

// The "constructor" keyword can be omitted if there are no annotations or visible modifiers on the constructor
class ConstructorExample2(tag: String) {
}