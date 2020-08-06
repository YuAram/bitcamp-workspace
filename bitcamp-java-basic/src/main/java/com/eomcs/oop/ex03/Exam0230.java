package com.eomcs.oop.ex03;

public class Exam0230 {
  static class Calculator {
    // new 명령을 실행하면 다음 변수 선언이 실행되어 힙메모리에 메모리를 만든다.
    int result;

    public void plus(int value) {
      this.result += value;
    }

    public void minus(int value) {
      this.result -= value;
    }
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(123);
    c2.minus(30);

    // 스태틱, 인스턴트 변수는 자동 초기화.
    System.out.println(c1.result);
    System.out.println(c2.result);
  }
}
