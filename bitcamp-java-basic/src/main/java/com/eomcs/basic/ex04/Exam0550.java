package com.eomcs.basic.ex04;

public class Exam0550 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    
    int[] arr2 = arr;
    
    arr2[0] = 100;
    
    System.out.println(arr[0]);
  }
}
