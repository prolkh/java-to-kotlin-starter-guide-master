package com.lannstark.lec12

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}


class Person private constructor(
    var name: String,
    var age: Int,
){

    companion object Factory: Log {
        val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        @JvmStatic
        override fun log() {
            println("Person class companion object")
        }
    }
}

object Singleton {
    var a: Int = 0
}