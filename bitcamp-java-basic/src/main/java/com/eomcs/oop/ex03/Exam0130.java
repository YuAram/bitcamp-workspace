package com.eomcs.oop.ex03;

public class Exam0130 {

  // static field = class variable
  static class A {
    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {
    A obj1 = new A(); // class A 설계도에 따라 Heap에 A의 인스턴스 v1, b2 생성
    A obj2 = new A();

    // 레퍼런스.변수명 = 100;
    // - 레퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라
    //   클래스 변수라면 컴파일러가 컴파일하는 과정에 정확하게
    //   클래스 변수를 가리키도록 기계어로 바꾼다.
    // - 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도
    //   컴파일러가 클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환한다.
    obj1.v1 = 100; // => A.v1 = 100;
    obj2.v1 = 200; // => a.v1 = 200;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
  }
}

// 클래스 로딩
// 1. 클래스 파일을 찾는다
// 2. 클래스 파일 검증
// 3. 클래스를 Method Area 영역에 로딩