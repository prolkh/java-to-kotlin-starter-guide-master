package com.lannstark.lec14

fun main() {
    val dto1 = PersonDto("이경호", 100)
    val dto2 = PersonDto("이경호", 200)
    println(dto1 == dto2)
    println(dto1)
}

data class PersonDto (
    val name: String,
    val age: Int,
)