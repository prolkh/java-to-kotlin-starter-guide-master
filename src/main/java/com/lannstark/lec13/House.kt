package com.lannstark.lec13

fun main() {

}

class House (
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )

    inner class InnerClassLivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}

// 클래스 안의 클래스 Java 는 두가지 종류가 있다.
// static 을 사용하는 클래스, static 을 사용하지 않는 클래스
// static 을 사용하는 클래스를 권장됨

// 코틀린에서는 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조가 없고
// 바깥 클래스를 참조하고 싶다면, inner 키워드를 붙여야 한다.
// 코틀린 inner class 에서 바깥 클래스를 참조하려면 this@바깥클래스를 사용해야 한다.