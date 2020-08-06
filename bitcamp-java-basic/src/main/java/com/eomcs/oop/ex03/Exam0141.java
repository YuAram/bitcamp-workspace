package com.eomcs.oop.ex03;

public class Exam0141 {

  static class A {
    static int v1;
    int v2;
  }

  public static void main(String[] args) {
    // 클래스 변수는 클래스가 로딩되는 수간 바로 사용할 수 있다.
    // 클래스가 로딩되는 경우
    // 클래스 변수나 클래스 메서드를 사용할 때
    // 인스턴스를 생성할 때
    // 단 중복 로딩되지 않는다.
    A.v1 = 100;

    A p = new A();

    p.v2 = 200;

    A p2 = new A();
    p2.v2 = 300;

    System.out.printf("%d, %d, %d, %d\n",p.v1, p2.v1, p.v2, p2.v2);
  }
}
