package com.lannstark.lec20

import com.lannstark.lec19.Person

fun main() {
    val person = Person("이경호", 30)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    val strings = listOf("APPLE", "CAR")
    strings.map {it.length}
        .filter { it > 3 }
        .let {lengths -> println(lengths)}

    // let
    val str = "hello world"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // let
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if(firstItem.length >= 5) firstItem else "hello $firstItem"
        }.uppercase()
}
