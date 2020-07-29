package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1
//- 다음 int 변수에 들어 있는 값을
//  다음과 같이 첫 바이트에서 끝 바이트까지 16진수로 순서대로 출력하라!
//실행 예)
//aa
//bb
//cc
//dd
//
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd;
    
    System.out.println(Integer.toHexString((value & 0xff000000) >>> 24));
    System.out.println(Integer.toHexString((value & 0x00ff0000) >>> 16));
    System.out.println(Integer.toHexString((value & 0x0000ff00) >>> 8));
    System.out.println(Integer.toHexString( value & 0x000000ff));
  }
}