package com.eomcs.oop.ex02;

import com.eomcs.util.CalculatorOld;

public class Exam0210Old {



  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라.!
    // 식1) 2 + 3 - 1 * 7 / 3 = 9
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 식1과 식2를 동시에 계산할 수 있는가?
    // => 불가하다!
    // => Calculator는 result 변수를 한 개만 관리하기 때문에
    //    동시에 여러 개의 식 결과를 따로 관리할 수 없다.

    // 현재 버전에서는 식1과 식2를 차례대로 계산해야 한다.
    //    Calculator.plus(2); // 식1) 0 + 2
    //    Calculator.plus(3); // 식1) 0 + 2 + 3
    //    Calculator.minus(1); // 식1) 0 + 2 + 3 - 1
    //    Calculator.multiple(7); // 식1) 0 + 2 + 3 - 1 * 7
    //    Calculator.divide(3); // 식1) 0 + 2 + 3 - 1 * 7 / 3
    //    printResult(Calculator.result);
    //
    //    Calculator.result = 0;
    //    Calculator.plus(3); // 식2) 0 + 3
    //    Calculator.multiple(2); // 식2) 0 + 3 * 2
    //    Calculator.plus(7); // 식2) 0 + 3 * 2 + 7
    //    Calculator.divide(4); // 식2) 0 + 3 * 2 + 7 / 4
    //    Calculator.minus(5); // 식2) 0 + 3 * 2 + 7 / 4 - 5
    //    printResult(Calculator.result);

    // 식1과 식2를 동시에 계산하려면 result 변수를 두 개 준비해야 한다.

    CalculatorOld c1 = new CalculatorOld();
    CalculatorOld c2 = new CalculatorOld();

    //    Calculator.plus(c1, 2); // 식1) 0 + 2
    //    Calculator.plus(c1, 3); // 식1) 0 + 2 + 3
    //    Calculator.minus(c1, 1); // 식1) 0 + 2 + 3 - 1
    //    Calculator.multiple(c1, 7); // 식1) 0 + 2 + 3 - 1 * 7
    //    Calculator.divide(c1, 3); // 식1) 0 + 2 + 3 - 1 * 7 / 3
    //    printResult(c1.result);
    //
    //    Calculator.plus(c2, 3); // 식2) 0 + 3
    //    Calculator.multiple(c2, 2); // 식2) 0 + 3 * 2
    //    Calculator.plus(c2, 7); // 식2) 0 + 3 * 2 + 7
    //    Calculator.divide(c2, 4); // 식2) 0 + 3 * 2 + 7 / 4
    //    Calculator.minus(c2, 5); // 식2) 0 + 3 * 2 + 7 / 4 - 5
    //    printResult(c2.result);

    c1.plus(2); // 식1) 0 + 2
    c1.plus(3); // 식1) 0 + 2 + 3
    c1.minus(1); // 식1) 0 + 2 + 3 - 1
    c1.multiple(7); // 식1) 0 + 2 + 3 - 1 * 7
    c1.divide(3); // 식1) 0 + 2 + 3 - 1 * 7 / 3
    printResult(c1.result);

    c2.plus(3); // 식2) 0 + 3
    c2.multiple(2); // 식2) 0 + 3 * 2
    c2.plus(7); // 식2) 0 + 3 * 2 + 7
    c2.divide(4); // 식2) 0 + 3 * 2 + 7 / 4
    c2.minus(5); // 식2) 0 + 3 * 2 + 7 / 4 - 5
    printResult(c2.result);


  }

  static void printResult(int value) {
    System.out.println("*************************");
    System.out.printf("==> 결과 = %d\n",value);
    System.out.println("*************************");
  }
}
