package com.eomcs.util;

class Calculator_c {
  static int result = 0;

  static void plus(int value) {
    result += value;
  }

  static void minus(int value) {
    result -= value;
  }

  static void multiple(int value) {
    result *= value;
  }

  static void divide(int value) {
    result /= value;
  }
}
