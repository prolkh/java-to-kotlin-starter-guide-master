package com.lannstark.lec10;

/*
public class Lec10Main {

  public static void main(String[] args) {
    new JavaDerived();
  }

}
*/

fun main() {
  Derived(300)
}

open class Base(
  open val number: Int = 100
) {
  init {
    println("Base Class")
    println(number)
  }
}

class Derived(
  override val number: Int
) : Base(number) {
  init {
    println("Derived Class")
  }
}

// 상속 키워드 정리
// final : override를 할 수 없게 한다. default
// open : override를 열어 준다.
// abstract : 반드시 override 해야 한다.
// override : 상위 타입을 오버라이드 하고 있다.

// 상속 또는 구현을 알 때에 : 을 사용해야 한다.
// 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 한다.
// override 를 필수로 붙여야 한다.
// 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다. open 을 사용하면 가능하다.
// 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 예상하지 못한 버그가 생길 수 있다.