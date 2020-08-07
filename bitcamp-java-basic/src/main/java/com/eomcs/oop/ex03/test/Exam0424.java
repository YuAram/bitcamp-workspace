package com.eomcs.oop.ex03.test;

class SmartPhone {

  int volume;
  int bright;
  int contrast;

  //  private public SmartPhone() {
  //    System.out.println("SmartPhone() 생성자 호출됨@!");
  //  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨@!");
  }
}

public class Exam0424 {
  public static void main(String[] args) {
    SmartPhone obj = new SmartPhone(50);
  }
}
