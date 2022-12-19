package com.lannstark.lec16

fun main() {

    // 멤버함수와 확장함수
    val person = Person("A", "B", 100)
    person.nextYearAge()    // 멤버함수가 호출됨


    // 확장함수 오버라이드
    val train: Train = Train()
    train.isExpensive() // Train 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive()  // Train 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive()  // Srt 확장함수


    // infix 함수 (중위 함수)
    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)

    // inline 함수
    println(3.add3(4))
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train 확장함수")
    return this.price >= 10000
}

class Srt : Train("Srt", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt 확장함수")
    return this.price >= 10000
}

fun Int.add(num : Int): Int {
    return this + num
}

infix fun Int.add2(num: Int): Int {
    return this + num
}

inline fun Int.add3(num: Int): Int {
    return this + num
}

fun createPerson(firstName: String, lastName: String): Person {
    if (firstName.isEmpty()) {
        throw java.lang.IllegalArgumentException("firstName은 비어있을 수 없습니다. 현재 값 : $firstName")
    }
    if (lastName.isEmpty()) {
        throw java.lang.IllegalArgumentException("lastName은 비어있을 수 없습니다. 현재 값 : $lastName")
    }

    return Person(firstName, lastName, 1)
}

// 지역함수를 사용해서 중복 제거
fun createPerson2(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if(name.isEmpty()){
            throw java.lang.IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재값 : $name")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}


// Java 코드가 있는 상황에서 Kotlin 코드로 추가 기능 개발을 하기 위해서 확장함수와 확장 프로퍼티가 등장했다.
// 확장함수는 원본 클래스의 private, protected 멤버 접근이 안 된다.
// 멤버함수가 우선권이 있다. (확장함수와 비교해서)
// 확장함수는 현재 타입을 기준으로 호출된다.
// Java 에서 static 함수를 쓰는 것처럼 Kotlin 확장함수를 쓸 수 있다.
// 중위 함수 생성에는 infix 키워드를 사용한다.
// inline 키워드를 사용하면 콜 체인 오버헤드를 줄일 수 있으나 성능 측정과 함께 주의하여 사용해야 한다.
// Kotlin 에서는 함수 안에 함수를 선언 가능하고 이를 지역함수라고 한다.
