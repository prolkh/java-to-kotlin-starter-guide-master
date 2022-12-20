package com.lannstark.lec17

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

    // 람다를 만드는 방법1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법2
    var isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 만드는 방법3
    var isApple3: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }


    // 람다를 호출하는 방법1
    isApple(fruits[0])
    // 람다를 호출하는 방법2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)

    filterFruits(fruits) {it.name == "사과"}

    // Closure
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName }
}


private fun filterFruits( fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if(filter.invoke(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

// 함수는 Java 에서 2급 시민이지만, 코틀린에서는 1급 시민이다.
// 코틀린에서는 함수 자체를 변수에 넣을 수도 있고 파라미터로 전달할 수도 있다.
// 코틀린에서 람다는 두가지 방식으로 만들 수 있고 {} 방법이 더 많이 쓰인다.
// 함수를 호출하며 마지막 파라미터인 람다를 쓸 때는 소괄호 밖으로 람다를 빼낼 수 있다.
// 파라미터가 한 개인 람다를 쓸 때는 it 으로 접근할 수 있다.
// 람다의 마지막 expression 결과는 람다의 반환 값이다.
// 코틀린에서는 Closure를 사용하여 non-final 변수도 람다에서 사용할 수 있다.