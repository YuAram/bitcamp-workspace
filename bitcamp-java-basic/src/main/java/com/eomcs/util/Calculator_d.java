package com.eomcs.util;

public class Calculator_d {
  public static int result = 0;

  public static void plus(int value) {
    result += value;
  }

  public static void minus(int value) {
    result -= value;
  }

  public static void multiple(int value) {
    result *= value;
  }

  public static void divide(int value) {
    result /= value;
  }
}

// 다른 패키지에서도 사용할 수 있도록 public 추가

