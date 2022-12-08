package com.lannstark.lec02;

//public class Lec02Main {
//
//  public static void main(String[] args) {
//
//  }
//
//  public boolean startsWithA1(String str) {
//    if (str == null) {
//      throw new IllegalArgumentException("null이 들어왔습니다");
//    }
//    return str.startsWith("A");
//  }
fun startsWithA1(str: String?): Boolean {
  return str?.startsWith("A") ?: throw java.lang.IllegalArgumentException("null이 들어왔습니다.")
}
//
//
//  public Boolean startsWithA2(String str) {
//    if (str == null) {
//      return null;
//    }
//    return str.startsWith("A");
//  }
fun startWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}
//
//
//  public boolean startsWithA3(String str) {
//    if (str == null) {
//      return false;
//    }
//    return str.startsWith("A");
//  }
fun startWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}
//}
