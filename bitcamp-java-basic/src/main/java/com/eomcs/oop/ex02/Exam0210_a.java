package com.eomcs.oop.ex02;

public class Exam0210_a {

  static class Calculator {

    static int plus(int a, int b) {
      return a + b;
    }

    static int minus(int a, int b) {
      return a - b;
    }

    static int multiple(int a, int b) {
      return a * b;
    }

    static int divide(int a, int b) {
      return a / b;
    }
  }

  public static void main(String[] args) {
    // 2+ 3 - 1 * 7 / 3 = 9
    int result = 0;

    result = Calculator.plus(2,3);
    result = Calculator.minus(result, 1);
    result = Calculator.multiple(result, 7);
    result = Calculator.divide(result, 3);

    printResult(result);
  }

  static void printResult(int value) {
    System.out.println("*************************");
    System.out.printf("==> 결과 = %d\n",value);
    System.out.println("*************************");
  }
}

// 1) Method Area에 Exem0210 class 명령코드 로딩
// 2) Stack에 main() 변수 args, result 변수 생성
// 3) Method Area에 Calculator class 명령코드 로딩
// 4) Stack에 plus() 로컬 변수 a, b 생성
// 5) Stack에 있는 result 변수에 값을 리턴 후 4) 내용 소멸
// 6) Stack에 minus() 로컬 변수 a, b 생성
// 7) Stack에 있는 result 변수에 값을 리턴 후 6) 내용 소멸
// 8) Stack에 multiple() 로컬 변수 a, b 생성
// 9) Stack에 있는 result 변수에 값을 리턴 후 8) 내용 소멸
// 10) Stack에 divide() 로컬 변수 a, b 생성
// 11) Stack에 있는 result 변수에 값을 리턴 후 10) 내용 소멸
// 12) Stack에 printResult() 로컬 변수 value 생성
// 13) 메소드 내용 실행 후, Stack printResult()의 로컬 변수 value 소멸
// 14) main() 소멸
// 15) OS에 메모리 반납.

