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