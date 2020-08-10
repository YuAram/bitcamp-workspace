package com.eomcs.oop.ex04;

public class Exam0111 {
  public static void main(String[] args) {
    String s1 = new String("Hello");

    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
    String s2 = new String(chars);

    byte[] bytes = {
        (byte)0x48, // H
        (byte)0x65, // e
        (byte)0x6c, // l
        (byte)0x6c, // l
        (byte)0x6f  // o
    };
    String s3 = new String(bytes);

    System.out.printf("%s, %s, %s \n", s1, s2, s3);
  }
}
