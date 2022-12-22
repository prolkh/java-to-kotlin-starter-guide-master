package com.lannstark.lec18

fun main() {

    val fruits = listOf(
        Fruit(1L, "사과", 1_000, 1_500),
        Fruit(2L, "사과", 1_200, 1_500),
        Fruit(3L, "사과", 1_500, 1_500),
        Fruit(4L, "바나나", 3_000, 3_200),
        Fruit(5L, "바나나", 3_200, 3_200),
        Fruit(6L, "바나나", 2_500, 3_200),
        Fruit(7L, "수박", 10_000, 10_000),
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
        .map { fruit -> fruit.factoryPrice }

    // mapIndexed
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.factoryPrice
        }

    // mapNotNull
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.factoryPrice }

    // all
    fruits.all { fruit -> fruit.name == "사과" }

    // none
    fruits.none {fruit -> fruit.name == "사과" }

    // any
    fruits.any { fruit -> fruit.factoryPrice >= 10_000 }

    // count
    fruits.count()

    // sortedBy, sortedByDescending
    fruits.sortedBy { fruit -> fruit.factoryPrice }
    fruits.sortedByDescending { fruit -> fruit.factoryPrice }

    // distinctBy
    fruits.distinctBy { fruit -> fruit.name }

    // first, firstOrNull
    fruits.first()
    fruits.firstOrNull()

    // last, lastOrNull
    fruits.last()
    fruits.lastOrNull()

    // groupBy, associateBy
    // Map<String, List<Fruit>>
    fruits.groupBy { fruit -> fruit.name }

    // Map<Long, Fruit>
    fruits.associateBy { fruit -> fruit.id }

    // Map<<String, List<Long>>
    fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    // Map<Long, Long>
    fruits.associateBy ({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    // Map<String, List<Fruit>>
    fruits.groupBy {fruit -> fruit.name}
        .filter { (key, value) -> key == "사과" }

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(4L, "바나나", 3_000, 3_200),
            Fruit(5L, "바나나", 3_200, 3_200),
            Fruit(6L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(7L, "수박", 10_000, 10_000),
        )
    )

    // flatMap
    fruitsInList.flatMap { list ->
        list.filter {fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    // 확장함수를 이용한 리팩토링
    fruitsInList.flatMap { list -> list.samePriceFilter }

    // List<List<Fruit>> -> List<Fruit>
    fruitsInList.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}