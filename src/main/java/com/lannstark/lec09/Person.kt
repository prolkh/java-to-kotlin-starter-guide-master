package com.lannstark.lec09

fun main() {
    val person = Person("이경호", 100)
    println("person.name = ${person.name}")
    person.age = 30
    println("person.age = ${person.age}")

    Person()
}

class Person (
    val name: String = "이경호",
    var age: Int = 1
) {
    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    init {
        if(age <= 0) {
            throw java.lang.IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1){
        println("부생성자")
    }

//    fun isAdult(): Boolean{
//        return this.age >= 20
//    }
    
    val isAdult: Boolean
        get() = this.age >= 20  // custom getter
}


// 코틀린에서는 필드를 만들면 getter 와 setter 가 자동으로 생긴다. 프로퍼티
// 코틀린에서는 주생성자가 필수이다.
// 부생성자 대신에 default parameter 나 정적 팩토리 메서드를 추천한다.
// custom getter, custom setter 에서 무한 루프를 막기 위해 field 키워드를 사용한다.