package com.lannstark.lec07

//import java.io.IOException;
//
//public class Lec07Main {
//  private int parseIntOrThrow(@NotNull String str) {
//    try {
//      return Integer.parseInt(str);
//    } catch (NumberFormatException e) {
//      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str))
//    }
//  }
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        throw java.lang.IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

//  private int parseIntOrThrow2(@NotNull String str) {
//    try {
//      return Integer.parseInt(str);
//    } catch (NumberFormatException e) {
//      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str))
//    }
//  }
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        null
    }
}


//
//  public static void main(String[] args) throws IOException {
//  }
//}
