package com.lannstark.lec05

//public class Lec05Main {
//
//  public static void main(String[] args) {
//  }
//
//  private void validateScoreIsNotNegative(int score) {
//    if(score < 0) {
//      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
//    }
//  }
fun validateScoreIsNotNegative(score: Int) {
  if(score < 0) {
    throw java.lang.IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
  }
}

//private String getPassOrFail(int score) {
//  if(score >= 50) {
//    return "P";
//  } else {
//    return "F";
//  }
//}
fun getPassOrFail(score: Int): String {
  return if (score >= 50) {
    "P"
  } else {
    "F"
  }
}

//private String getGradeWithSwitch(int score) {
//  switch (score / 10) {
//    case 9:
//      return "A";
//    case 8:
//      return "B";
//    case 7:
//      return "C";
//    default:
//      return "D";
//  }
//}
fun getGradeWithSwitch(score: Int): String {
  return when (score / 10) {
    9 -> "A"
    8 -> "B"
    7 -> "C"
    else -> "D"
  }
}


//  public boolean startsWithA(Object str) {
//    if (obj instanceof String) {
//      return ((String) obj).startsWith("A");
//    }
//    return false;
//  }
fun startsWithA(obj: Any): Boolean {
  return when(obj) {
    is String -> obj.startsWith("A")
    else -> false
  }
}


//
//  private void judgeNumber2(int number) {
//    if (number == 0) {
//      System.out.println("주어진 숫자는 0입니다");
//      return;
//    }
//
//    if (number % 2 == 0) {
//      System.out.println("주어진 숫자는 짝수입니다");
//      return;
//    }
//
//    System.out.println("주어지는 숫자는 홀수입니다");
//  }
//}
fun judgeNumber2(number: Int) {
  when {
    number == 0 -> println("주어진 숫자는 0입니다.")
    number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
    else -> println("주어진 숫자는 홀수입니다.")
  }
}

// 코틀린에서 if-else 문이 Expression 으로 취급되어 return 할 수 있다.
// when 은 더 강력한 기능을 갖는다.