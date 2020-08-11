package com.eomcs.oop.ex05.a;

public class Exam01 {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.maker = "현대";
    c1.model = "Accent";
    c1.capacity = 1599;

    Car c2 = new Car("비트자동차", "소나타", 5);

    System.out.println(c1.maker);
    System.out.println(c1.model);
    System.out.println(c1.capacity);
  }
}
