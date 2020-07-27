package com.eomcs.basic.ex04;

public class Exam0551 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    
    arr = null; // arr가 아무것도 가리키지 않음을 의미.
    
    System.out.println(arr[0]);
  }
}
