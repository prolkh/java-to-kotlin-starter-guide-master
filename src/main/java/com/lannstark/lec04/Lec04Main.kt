package com.lannstark.lec04

/*
public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(2_000L);
    JavaMoney money2 = new JavaMoney(1_000L);

    if(money1.compareTo(money2)) {
      System.out.println("Money1 이 Money2 보다 금액이 큽니다"));  // (1)
    }

    JavaMoney money3 = new JavaMoney(2_000L);
    JavaMoney money4 = money3

    System.out.println(money3 == money4); // true         // (2)
    System.out.println(money1 == money3); // false
    System.out.println(money1.equals(money3)); // true

    System.out.println(money1.plus(money2).toString());   // (3)
  }
}
 */

fun main() {

  val money1 = JavaMoney(2_000L)
  val money2 = JavaMoney(1_000L)

  if(money1 > money2) { // 비교 연산자를 사용하면 자동으로 compareTo를 호출한다.
    println("Money1 이 Money2 보다 금액이 큽니다")   // (1)
  }

  val money3 = JavaMoney(2000L)
  val money4 = money3

  println(money3 === money4) // true              // (2)
  println(money1 === money3) // false
  println(money1 == money3) // true

  val kotlinMoney1 = KotlinMoney(1_000L)
  val kotlinMoney2 = KotlinMoney(2_000L)
  println(kotlinMoney1 + kotlinMoney2)            // (3)
}

// 단항, 산술, 산술대입 연산자는 Java와 동일하다.
// 비교 연산자 사용법도 유사하지만
// 자바의 ==은 코틀린의 ===, 자바의 equals 는 코틀린의 == 과 동일하다.
// in, !in, a..b, a[i], a[i] = b 와 같이 코틀린에서 새로 생긴 연산자도 있다.

