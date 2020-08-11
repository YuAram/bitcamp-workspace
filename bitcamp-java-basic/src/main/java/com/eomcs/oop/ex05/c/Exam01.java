package com.eomcs.oop.ex05.c;

public class Exam01 {
  public static void main(String[] args) {

    Car c1 = new Car();
    c1.maker = "현대";
    c1.model = "Accent";
    c1.capacity = 1599;

    Car c2 = new Car("비트자동차", "소나타", 5);

    Car2 c3 = new Car2("쌍용자동차", "티볼리", 5, false, true);

    System.out.println(c3.maker);
    System.out.println(c3.model);
    System.out.println(c3.capacity);
    System.out.println(c3.sunroof);
    System.out.println(c3.auto);
  }
}
