package com.eomcs.basic.ex07;

public class Exam0260 {
  static void hello(String... names) {
    for(int i = 0; i < names.length; i++) {
      System.out.println(names[i] + "님 반갑습니다^^!");
    }
  }
  static void hello2(String[] names) {
    for(int i = 0; i < names.length; i++) {
      System.out.println(names[i] + "님 반갑습니다^^!");
    }
  }
  public static void main(String[] args) {
    hello("나비", "고양이", "갱얼지");
    System.out.println();
    
    String[] arr = {"콩벌레", "잠자리"};
    
    hello(arr);
    
    hello2(arr);
  }
}
