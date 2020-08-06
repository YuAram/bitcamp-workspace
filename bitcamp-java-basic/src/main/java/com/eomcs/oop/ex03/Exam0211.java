package com.eomcs.oop.ex03;

public class Exam0211 {
  static class A {
    //1) 클래스 메서드
    //   => static 붙은 메서드이다.
    //   => 클래스 이름으로 호출할 수 있다.
    //   => "스태틱 메서드"라고도 부른다.
    static void m1() {
      System.out.println("m1()");
    }

    //2) 인스턴스 메서드
    //   => static 이 붙지 않은 메서드이다.
    //   => 인스턴스 주소가 있어야만 호출할 수 있다.
    void m2() {
      System.out.println("m2()");
    }
  }

  public static void main(String[] args) {
    A.m1();

    //A.m2();

    A obj1 = new A();

    obj1.m1(); // XXX

    obj1.m2();

    A obj2 = null;
    obj2.m2(); // 컴파일 ㅇㅋ 실행 오류

    // 실무
    // 일단 인스턴스 메서드로 무조건 만들라!
    // 인스턴스 변수를 완전히 사용하지 않음을 확신하면
    // 그 때 클래스 메서드로 전환하라~
  }
}
