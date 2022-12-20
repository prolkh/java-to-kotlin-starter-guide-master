package com.lannstark.lec18

import com.lannstark.lec17.Fruit

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // filter
    fruits.filter { fruit -> fruit.name == "사과"}

    // filterIndexed
    fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    
    // map
    fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price }

    // mapIndexed
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }

    // mapNotNull
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.price }

}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}