package com.lannstark.lec12

/*
public class Lec12Main {

  public static void main(String[] args) {
    Person.Factory.newBaby("ABC");

    // 익명클래스
    moveSomething(new Movable() {
      @Override
      public void move() { System.out.println("무브무브"); }

      @Override
      public void fly() { System.out.println("파리파리"); }
    });

  }

  private static void moveSomething(Movable movable) {
    movable.move();
    movable.fly();
  }
}
*/

fun main() {
  moveSomething(object : Movable {
    override fun move() {
      println("무브무브")
    }

    override fun fly() {
      println("파리파리")
    }
  })
}

private fun moveSomething(movable: Movable) {
  movable.move()
  movable.fly()
}

// Java 의 static 변수와 함수를 만드려면 companion object를 사용하면 된다.
// companion object 도 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고 다른 타입을 상속 받을 수도 있다.
// Kotlin 에서 싱글톤 클래스를 만들 때 object 키워드를 사용한다.
// Kotlin 에서 익명 클래스를 만들 때 `object : 타입`을 사용한다.