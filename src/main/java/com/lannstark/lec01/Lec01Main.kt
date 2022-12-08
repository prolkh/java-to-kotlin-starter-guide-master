package com.lannstark.lec01;

import java.util.Arrays;
import java.util.List;

/*
public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L;       // (1)
    final long number2 = 10L; // (2)

    Long number3 = 1_000L;    // (3)
    Person person = new Person("최태현"); // (4)
  }
}
*/

fun main() {
    var number1 = 10L   // (1) 변경 가능한 타입
    val number2 = 10L   // (2) 변경 불가능한 타입

    var number3 : Long? = 1_000L // (3) kotlin은 primitive type과 reference type 구분이 없다.
    var person = Person("최태현")  // (4) 객체를 인스턴스화할 때 new를 사용하지 않는다.
}
