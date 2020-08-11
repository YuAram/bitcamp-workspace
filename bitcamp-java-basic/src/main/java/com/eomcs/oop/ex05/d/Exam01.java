package com.eomcs.oop.ex05.d;

public class Exam01 {
  public static void main(String[] args) {

    Sedan c1 = new Sedan("쌍용자동차", "티볼리", 5, false, true);

    System.out.println(c1.maker);
    System.out.println(c1.model);
    System.out.println(c1.capacity);
    System.out.println(c1.sunroof);
    System.out.println(c1.auto);
  }
}
