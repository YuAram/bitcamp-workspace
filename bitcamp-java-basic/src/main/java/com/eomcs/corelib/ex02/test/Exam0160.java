package com.eomcs.corelib.ex02.test;

public class Exam0160 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    System.out.println(s1);
    String s2 = s1.replace('l', 'x');
    System.out.println(s2);
    String s3 = s1.concat(", world!");
    System.out.println(s3);
  }
}
