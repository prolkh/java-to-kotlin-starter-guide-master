package com.lannstark.lec14;

public class Lec14Main {

  public static void main(String[] args) {
    handleCountry(JavaCountry.KOREA);
  }

  private static void handleCountry(JavaCountry country) {
    if (country == JavaCountry.KOREA) {
      // TODO: 2022-12-18  
    }

    if (country == JavaCountry.AMERICA) {
      // TODO: 2022-12-18  
    }
  }
}

// 코틀린의 Data class 를 사용하면 equals, hashCode, toString 함수를 자동 생성해준다.
// Kotlin 의 Enum Class 는 Java 의 Enum Class 와 동일하지만, when 과 함께 사용함으로써 큰 장점을 갖게 된다.
// Enum Class 보다 유연하지만, 하위 클래스를 제한하는 Sealed Class 역시 when 과 함께 주로 사용된다.

