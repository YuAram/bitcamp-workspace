package com.eomcs.oop.ex05.e;

public class Exam01 {
  public static void main(String[] args) {
    B obj = new B();
    obj.v2 = 222;
    obj.v1 = 111;
    System.out.printf("v2:%d v1:%d\n",obj.v2,obj.v1);

    B obj2 = new B();
    obj2.v2 = 2222;
    obj2.v1 = 1111;
    System.out.printf("obj2)v2:%d v1:%d\n",obj2.v2,obj2.v1);
  }
}
