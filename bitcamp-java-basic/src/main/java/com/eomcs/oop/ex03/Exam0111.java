package com.eomcs.oop.ex03;

public class Exam0111 {
  public static void main(String[] args) {
    class A {
      // 인스턴스 변수
      // => new 명령을 통해 생성된다.
      // => new 명령을 실행하기 전까지는 인스턴스 변수는 존재하지 않는다.
      // => Heap 영역에 생성된다.
      // => static이 붙지 않는다(non-static)
      int v1;
      boolean v2;
    }

    // A 클래스에 대해 new 명령을 사용하기 전에는 v1, v2 메모리는 존재하지 않는다.
    // 단지 설계도일 뿐이다.
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    // 이렇게 생성된 메모리를 "인스턴스", "객체"라고 부른다.
    // 이 인스턴스의 주소를 저장하는 obj1, obj2, obj3를 "레퍼런스"라 부른다.
    // 인스턴스가 생성될 때 만ㄷ르어지는 v1, v2 변수를 "인스턴스 변수"라 부른다.

    // 인스턴스 변수는 레퍼런스를 통해 사용할 수 있다.
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.printf("%d %d %d \n", obj1.v1, obj2.v1, obj3.v1);
  }
}