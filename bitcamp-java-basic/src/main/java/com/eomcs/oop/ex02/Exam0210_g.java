package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210_g {

  public static void main(String[] args) {
    // 2+ 3 - 1 * 7 / 3 = 9
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 2);
    Calculator.plus(c1, 3);
    Calculator.minus(c1, 1);
    Calculator.multiple(c1, 7);
    Calculator.divide(c1, 3);

    printResult(c1.result);
  }

  static void printResult(int value) {
    System.out.println("*************************");
    System.out.printf("==> 결과 = %d\n",value);
    System.out.println("*************************");
  }
}

//1) Method Area에 Exem0210 class 명령코드 로딩
//2) Stack에 main() 변수 args 생성
//3) Method Area에 Calculator class 명령코드 로딩
//3-1) Calculator 설계도에 따라 c1, c2 변수 생성
//4) Heap에 Calculator class 인스턴스(non-static) result 변수 생성
//5) Stack에 plus() 로컬 변수 that, value 생성
//6) 데이터영역(Static 영역)에 that.result 변수에 값 대입 후 5) 내용 소멸
//7) Stack에 plus() 로컬 변수 that, value 생성
//8) 데이터영역(Static 영역)에 that.result 변수에 값 대입 후 5) 내용 소멸
//9) Stack에 minus() 로컬 변수 that, value 생성
//10) 데이터영역(Static 영역)에 that.result 변수에 값 대입 후 5) 내용 소멸
//11) Stack에 multiple() 로컬 변수 that, value 생성
//12) 데이터영역(Static 영역)에 that.result 변수에 값 대입 후 5) 내용 소멸
//13) Stack에 divide() 로컬 변수 that, value 생성
//14) 데이터영역(Static 영역)에 that.result 변수에 값 대입 후 5) 내용 소멸
//15) Stack에 printResult() 로컬 변수 value 생성
//16) 메소드 내용 실행 후, Stack printResult()의 로컬 변수 value 소멸
//17) main() 소멸
//18) OS에 메모리 반납.





