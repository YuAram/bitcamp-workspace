package com.eomcs.basic.ex07;

public class Exam0530 {
  public static void main(String[] args) {
    int sum = 0;
    for (String arg : args) {
      sum += Integer.parseInt(arg);
    }
    System.out.println("합계 : " + sum);
  }
}
