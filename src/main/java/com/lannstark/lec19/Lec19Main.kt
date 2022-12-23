package com.lannstark.lec19

import com.lannstark.lec18.Fruit

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {
    // do something
}

// typealias
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits2(fruits:List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperLongLongNameClass (
    val name: String
)

typealias USLLNCMap = Map<Long, UltraSuperLongLongNameClass>


/*
data class Person(
    val name: String,
    val age: Int
)
*/

class Person(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person("이경호", 30)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()


    println("name = $name")
    println("age = $age")

    val numbers = listOf(1, 2, 3, 4, 5)

    // forEach 에서 break 사용하기
    run {
        numbers.forEach {number ->
            if( number == 2)
                return@run
        }
    }

    // forEach 에서 continue 사용하기
    numbers.forEach {number ->
        if( number == 2 )
            return@forEach
    }
}

class Test(
    val name: String,
    val score: Int
) {

    // TakeIf TakeUnless
    fun getScoreOrNull(): Int? {
        return if (score <= 0) {
            null
        } else {
            score
        }
    }

    fun getScoreOrNullV2(): Int? {
        return score.takeIf {it > 0}
    }

    fun getScoreOrNullV3(): Int? {
        return score.takeUnless {it <= 0}
    }
}

// 타입에 대한 별칭을 줄 수 있는 typealias 키워드가 있다.
// Import 당시 이름을 바꿀 수 있는 as import 기능이 존재한다.
// 변수를 한번에 선언할 수 있는 구조분해 기능이 있다. componentN 함수를 사용한다.
// forEach 에서는 일반적으로 break 와 continue 를 사용할 수 없다.
// takeIf 와 takeUnless 를 활용해 코드양을 줄이고 method chaining 을 활용할 수 있다.