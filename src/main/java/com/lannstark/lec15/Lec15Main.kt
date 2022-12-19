package com.lannstark.lec15

fun main() {
    // 배열
    val array = arrayOf(100, 200)
    array.plus(300)

    for (i in array.indices) {
        println("array[${i}] = ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("idx = $idx")
        println("value = $value")
    }

    // 리스트
    val list = listOf(100, 200)
    val emptyList = emptyList<Int>()

    println(list[0])

    for (number in list) {
        println("number = $number")
    }

    for ((idx, value) in list.withIndex()) {
        println("idx = $idx")
        println("value = $value")
    }

    // 집합
    val set = setOf(100, 200)
    mutableSetOf(300L)  // LinkedHashSet

    for (number in set) {
        println("number = $number")
    }

    for ((idx, value) in set.withIndex()) {
        println("idx = $idx")
        println("value = $value")
    }

    // 맵
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println("key = $key")
        println("oldMap[key] = ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("key = $key")
        println("value = $value")
    }
}

// 배열의 사용법이 약간 다르다.
// 코틀린에서는 컬렉션을 만들 때도 불변/가변을 지정해야 한다.
// List, Set, Map 에 대한 사용법이 변경, 확장되었다.
// Java 와 Kotlin 코드를 섞어 컬렉션을 사용할 때에는 주의해야 한다.
// Java 에서 Kotlin 불변 컬렉션을 수정할 수도 있고,non-nullable 컬렉션에 null 을 넣을 수도 있다.
// Kotlin 에서 Java 컬렉션을 가져갈 때는 플랫폼 타입을 쓰는 것이기 때문에 주의해야 한다.