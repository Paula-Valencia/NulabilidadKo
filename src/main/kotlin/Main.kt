package org.example

fun main() {
    /*
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
     */
    /*
    var number: Int? = 10
    println(number)

    number = null
    println(number)
     */
    /*
    var favoriteActor: String? = null
    println(favoriteActor?.length)
     */
    /*
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
     */
    /*
    var favoriteActor: String? = null

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
     */
    /*
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if(favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println("The number of characters in your favorite actor's name is $lengthOfName.")
     */
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}