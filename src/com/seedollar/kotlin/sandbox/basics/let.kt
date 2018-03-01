package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val myHotels = listOf(

            Hotel("Hilton",
                    listOf(
                            Floor(1, Room("A1")),
                            Floor(2, Room("B1")),
                            null,
                            null,
                            Floor(5, Room("E2")),
                            Floor(6, null),
                            Floor(7, Room(null))
                    )
            ),
            null,
            Hotel("Sun",
                    listOf(
                            Floor(1, null),
                            null,
                            Floor(3, Room("B2")),
                            Floor(4, Room("C2")))
            )
    )

    // Use the 'let' keyword to filter out null objects
    for (hotel in myHotels) {
        hotel?.let {
            // Filter out null hotels
            for (floor in hotel.floors) {
                floor?.let { // Filter out null floors
                    floor.room?.let { // Filter out null rooms
                        println("Hotel: ${hotel.hotelName}, Floor: ${floor.floorNumber} Room No: ${floor?.room?.roomNumber}") // safe-call operators to display the room number
                    }
                }
            }
        }
    }
}

class Hotel(val hotelName: String, val floors: List<Floor?>)

class Floor(val floorNumber: Int, val room: Room?)

class Room(val roomNumber: String?)

