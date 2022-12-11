package com.lannstark.lec06

/*
public class Lec06Main {

  public static void main(String[] args) {

    for (int i = 1; i <= 5; i += 2) {
      System.out.println(i);
    }

    int i = 1;
    while (i <= 3) {
      System.out.println(i);
      i++;
    }
  }
}
*/

fun main() {
  for(i in 1..5 step 2) {
    println(i)
  }

  var i = 1
  while (i <= 3) {
    println(i)
    i++
  }
}

// for each 문에서 java는 : , Kotlin 은 in 을 사용한다.
