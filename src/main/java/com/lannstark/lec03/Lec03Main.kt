package com.lannstark.lec03

/*
public class Lec03Main {
  public static void main(String[] args) {
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }
}*/

fun main() {

}

fun printAgeIfPerson(obj : Any) {
  if (obj is Person) {
    println(obj.age)  // 스마트 캐스트
  }
}

// 코틀린은 is, !is, as, as? 를 이용해 타입확인 및 캐스팅 한다.
// Any는 자바의 Object와 같은 타입
// Unit은 자바의 void와 동일하다.