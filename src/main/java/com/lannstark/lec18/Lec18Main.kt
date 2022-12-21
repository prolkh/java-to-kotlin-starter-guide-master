package com.lannstark.lec18

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

    // all
    fruits.all { fruit -> fruit.name == "사과" }

    // none
    fruits.none {fruit -> fruit.name == "사과" }

    // any
    fruits.any { fruit -> fruit.price >= 10_000 }

    // count
    fruits.count()

    // sortedBy, sortedByDescending
    fruits.sortedBy { fruit -> fruit.price }
    fruits.sortedByDescending { fruit -> fruit.price }

    // distinctBy
    fruits.distinctBy { fruit -> fruit.name }

    // first, firstOrNull
    fruits.first()
    fruits.firstOrNull()

    // last, lastOrNull
    fruits.last()
    fruits.lastOrNull()

    // groupBy
    val groupByMap: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // associateBy
    // val associateByMap: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}