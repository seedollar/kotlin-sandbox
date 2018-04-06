package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val nonNullableString: String
    // Cannot do this because nonNullableString cannot be assigned null, ever!
//     nonNullableString = null

    // We mark a variable as nullable with the ? character
    val nullableString: String?
    nullableString = null
    // The compiler will also complain here because nullableString can throw NPE
//    val count = nullableString.length
}
