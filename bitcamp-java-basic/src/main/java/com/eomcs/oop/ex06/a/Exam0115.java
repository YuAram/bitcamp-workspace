package com.eomcs.oop.ex06.a;

public class Exam0115 {

  public static void main(String[] args) {

    Car c = new Sedan();

    c.model = "엑센트";
    c.capacity = 6;
    c.cc = 890;
    c.valve = 16;

    //    c.sunroof = true;
    //    c.auto = true;

    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;

    System.out.println(((Sedan)c).sunroof);
    System.out.println(((Sedan)c).auto);

    Sedan s = (Sedan)c;
    System.out.println(s.sunroof);
    System.out.println(s.auto);
  }
}
