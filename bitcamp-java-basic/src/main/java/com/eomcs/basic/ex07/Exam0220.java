package com.eomcs.basic.ex07;

public class Exam0220 {
  public static void main(String[] args) {

    System.out.println("main()11111");

    hello("홍길동", 20);
    hello("임꺽정", 30);
    hello("유관순", 10);
  }

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n",age,name);
  }
}
