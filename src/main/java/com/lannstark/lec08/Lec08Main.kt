package com.lannstark.lec08

/*
public class Lec08Main {

  public static void main(String[] args) {

  }

  public int max(int a, int b) {      // (1)
    return a > b ? a : b;
  }

  public void repeat(String str, int num, boolean useNewLine) {   // (2)
    for (int i = 1; i<=num; i ++) {
      if(useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }

  public void repeat(String str, int num) {
    repeat(str, num, true);
  }

  public void repeat(String str) {
    repeat(str, 3, true);
  }

  public static void printAll(String... strings) {    // (3)
    for (String str : strings) {
      System.out.println(str);
    }
  }
}
*/


fun max(a: Int, b: Int) = if (a > b) a else b   // (1)

fun main(){
  repeat("hello world!")
  repeat("hello world!", useNewLine = false)    // named argument
  printNameAndGender(name = "이경호", gender = "helicopter")
  // Kotlin 에서 Java 함수를 가져다 사용할 때는 named argument 를 사용할 수 없다.
  // 자바는 바이트 코드로 변환될 때 파라미터 이름을 저장하지 않기 때문이다.

  printAll("A", "B", "C")

  val array = arrayOf("D", "E", "F")
  printAll(*array)  // 배열은 바로 넣을 수 없고 spread 연산자를 앞에 달아주어야 한다.
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {     // (2)
  for (i in 1..num) {
    if (useNewLine) {
      println(str)
    } else {
      print(str)
    }
  }
}

fun printNameAndGender(name: String, gender: String) {    // (3)
  println("name = $name")
  println("gender = $gender")
}

fun printAll(vararg strings: String) {
  for (str in strings) {
    println("str = $str")
  }
}

// 함수 문법은 Java 와 다르다.
// body 가 하나의 값으로 간주되는 경우 block 을 없앨 수도 있고, block 이 없다면 반환 타입을 없앨 수도 있다.
// 함수 파라미터에 기본값을 설정해줄 수 있다.
// 함수 호출 시에 특정 파라미터를 지정해서 넣어줄 수 있다.
// 가변 인자에는 vararg 키워드를 사용해야 한다.
// 가변인자 함수를 배열과 호출할 때는 *를 붙여주어야 한다.