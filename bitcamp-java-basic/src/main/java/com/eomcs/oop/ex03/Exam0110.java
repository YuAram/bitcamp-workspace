package com.eomcs.oop.ex03;

public class Exam0110 {

  public static void main(String[] args) {
    // non-static variable
    class A {
      int v1;
      boolean v2;
    }
    A obj1 = new A(); // class A 설계도에 따라 Heap에 A의 인스턴스 v1, b2 생성
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;
  }
}
