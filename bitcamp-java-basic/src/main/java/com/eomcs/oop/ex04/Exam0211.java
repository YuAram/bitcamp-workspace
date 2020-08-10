package com.eomcs.oop.ex04;

public class Exam0211 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");

    char c = s1.charAt(1);
    System.out.println(c);

    System.out.println(s1.compareTo("Helln"));
    System.out.println(s1.compareTo("Hello"));
    System.out.println(s1.compareTo("Hellp"));

    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ee"));

    String s2 = s1.concat(", world!");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1.equals("aaa"));
    System.out.println(s1.equals("Hello"));

    String s3 = new String("ABC가각");

    byte[] bytes = s3.getBytes();

    for (byte a : bytes) {
      System.out.printf("%x,", a);
    }
    System.out.println();

    bytes = s3.getBytes("EUC-KR");
    for (byte a : bytes) {
      System.out.printf("%x,", a);
    }
    System.out.println();

    String s4 = String.format("%s님 환영^^","길동이");
    System.out.println(s4);

    String s5 = String.join("", "홍길", "임꺽", "유관");
    System.out.println(s5);

    String s6 = String.valueOf(true);
    String s7 = String.valueOf(3.14f);
    String s8 = String.valueOf(100);
    System.out.printf("%s\n",s6);
    System.out.printf("%s\n",s7);
    System.out.printf("%s\n",s8);
  }
}
