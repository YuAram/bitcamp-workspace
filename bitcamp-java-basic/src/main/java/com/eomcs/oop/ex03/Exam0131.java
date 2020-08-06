package com.eomcs.oop.ex03;

public class Exam0131 {

  static class A {
    // 클래스 변수 = 스태틱 변수
    // - 클래스를 로딩하는 순간 자동 생성된다.
    // 클래스 이름으로 사용한다고 해서 "클래스에 소속된 변수", "클래스 변수"라 부른다.
    // 스태틱이 붙은 변수이기 떄문에 스태틱 변수라고도 부른다.
    // 클래스와 함께 메소드 영역에 존재한다.
    // - 문법
    // static 데이터타입 변수명;

    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {
    // 클래스 변수 사용법
    // 클래스명.스태틱변수명 = 값;
    // 클래스를 사용하는 순간 클래스가 로딩되고, 스태틱 변수는 자동 생성된다.
    A.v1 = 100;
    A.v2 = true;

    System.out.printf("%d %b\n",A.v1, A.v2);
  }
}
