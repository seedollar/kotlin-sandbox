package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {
    var name: String? = "Gary"
    // Should print 'Gary' using elvis operator
    println(name ?: "'John' because name variable is null")
    name = null
    // Should print 'John' using elvis operator
    println(name ?: "'John' because name variable is null")


    var newSession = Session()
    newSession.adminUser = null
    newSession.locked = true
    // Should print 'No'
    println(newSession.isUserValid())

    newSession.adminUser = false
    newSession.locked = null
    // Should throw NPE exception
    println(newSession.isUserValid())
}

class Session {
    var adminUser: Boolean? = false
    var locked: Boolean? = false

    fun isUserValid(): String? {
        var isValid = this.adminUser ?: return "No"

        var keepAlive = this.locked ?: throw NullPointerException("locked cannot be null")
        return if (isValid && keepAlive) {
            "Valid"
        } else {
            "NotValid"
        }

    }
}