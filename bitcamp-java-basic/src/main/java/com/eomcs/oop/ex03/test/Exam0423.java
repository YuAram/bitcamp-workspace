package com.eomcs.oop.ex03.test;

public class Exam0423 {
  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    public SmartPhone() {
      this(50, 50, 50);
      System.out.println("SmartPhone() 생성자 호출됨@!");
    }

    public SmartPhone(int volume) {
      System.out.println("SmartPhone(int) 생성자 호출됨@!");
      this.volume = volume;
      this.bright = 50;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright) {
      System.out.println("SmartPhone(int, int) 생성자 호출됨@!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright, int contrast) {
      System.out.println("SmartPhone(int, int, int) 생성자 호출됨@!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = contrast;
    }

    void m1() {

    }
  }

  public static void main(String[] args) {
    SmartPhone obj1 = new SmartPhone();
  }
}
