package com.eomcs.oop.ex06.a;

public class Exam0112 {

  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    // b2 = v;

    // 만약 위의 코드가 가능하다면,
    // 다음과 같이 Bike 레퍼런스로 Bike 인스턴스 변수를 사용하려 할 것이다.
    b2.engine = true;
  }
}
