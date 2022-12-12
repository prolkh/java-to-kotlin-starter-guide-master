package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/*
public class JavaFilePrinter {
  public static void main(String[] args) throws IOException {
    JavaFilePrinter printer = new JavaFilePrinter();
    printer.readFile();
  }

  public void readFile() throws IOException {
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    System.out.println("reader.readLine() = " + reader.readLine());
    reader.close();
  }

  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }
}
*/

fun main() {
  readFile()
  readFile("./a.txt")
}

fun readFile() {
  val currentFile = File(".")
  val file = File(currentFile.absolutePath + "/a.txt")
  val reader = BufferedReader(FileReader(file))
  println("reader.readLine() = ${reader.readLine()}")
  reader.close()
}

fun readFile(path: String) {
  BufferedReader(FileReader(path)).use { reader ->
    println("reader.readLine() = ${reader.readLine()}")
  }
}

// try catch 는 문법적으로 동일하나 코틀린에서는 expression 이기 때문에 반환이 가능하다.
// 코틀린에서는 Checked Exception 과 Unchecked Exception 을 구분하지 않는다.
// 코틀린에서는 try with resources 가 사라지고 use 라는 inline 확장함수를 사용한다.
