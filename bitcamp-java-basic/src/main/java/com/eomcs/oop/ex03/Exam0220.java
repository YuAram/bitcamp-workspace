package com.eomcs.oop.ex03;

public class Exam0220 {
  static class A {
    int value;

    static void m1() {
      //      this.value = 100;
    }

    void m2() {
      this.value = 100;
    }

    void m3() {
      value = 200; // this.value = 200;
    }

    void m4(int value) {
      // 로컬변수의 이름과 인스턴스의 이름이 같으면
      // this를 붙이지 않으면 로컬변수를 가리킨다.
      value = 200; // 로컬
      this.value = 300; // 인스턴
    }
  }

  public static void main(String[] args) {
    A.m1();

    A obj = new A();

    obj.m2();

    obj.m1();

    A obj2 = new A();

    obj2.m2();
    // 인스턴스 메서드의 디스 변수는 메서드를 호출할 때 전달한 인스턴스 주소 값을 가짐
    // 그래서 메서드가 호출될 떄 마다 디스 변수의 값이 바뀐다.
  }
}
