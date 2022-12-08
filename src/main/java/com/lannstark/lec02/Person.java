package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

// 플랫폼 타입(null에 관련된 어노테이션을 사용하지 않는 타입)은 사용에 유의해야 한다.
//  @NotNull
//  @Nullable
  public String getName() {
    return name;
  }

}


