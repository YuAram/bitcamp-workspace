package com.eomcs.corelib.ex02.test;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);

    System.out.println(s1.equals(s2));
  }
}
