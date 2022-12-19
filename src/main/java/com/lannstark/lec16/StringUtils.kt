package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar() : Char {
    return this[this.length - 1]
}

// 확장 프로퍼티
val String.lastChar: Char
    get() = this[this.length - 1]

