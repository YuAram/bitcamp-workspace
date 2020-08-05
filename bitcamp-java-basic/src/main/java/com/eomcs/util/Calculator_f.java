package com.eomcs.util;

public class Calculator_f {
  public int result = 0;

  public static void plus(Calculator that, int value) {
    that.result += value;
  }

  public static void minus(Calculator that, int value) {
    that.result -= value;
  }

  public static void multiple(Calculator that, int value) {
    that.result *= value;
  }

  public static void divide(Calculator that, int value) {
    that.result /= value;
  }
}

