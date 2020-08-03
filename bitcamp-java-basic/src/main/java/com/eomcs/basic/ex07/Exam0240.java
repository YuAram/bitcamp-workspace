package com.eomcs.basic.ex07;

public class Exam0240 {
  static String hello(String name, int age) {
    String info = String.format("%d세 %s님을 환영!",age, name);
    return info;
  }

  public static void main(String[] args) {
    String r = hello("홍길동", 20);
    System.out.println(r);

    hello("임꺽줭",30);
  }
}
