package com.lannstark.lec11

class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
){

    var price = _price
        private set
}

// public 모든 곳에서 접근 가능
// protected 선언된 클래스 또는 하위클래스에서만 접근 가능
// internal 같은 모듈에서만 접근 가능
// private 선언된 클래스 내에서만 접근 가능

// 코틀린에서 패키지는 namespace 관리용이기 때문에 protected 는 의미가 달라졌다.
// 코틀린에서 default 가 사라지고 모듈간의 접근을 통제하는 internal 이 새로 생겼다.
// 생성자에 접근 지시어를 붙일 때는 constructor 를 명시적으로 써주어야 한다.
// 유틸성 함수를 만들 때는 파일 최상단을 이용하면 편리하다.
// 프로퍼티의 custom setter 에 접근 지시어를 붙일 수 있다.
// 자바에서 코틀린 코드를 사용할 때에는 internal 과 protected는 주의해야 한다.