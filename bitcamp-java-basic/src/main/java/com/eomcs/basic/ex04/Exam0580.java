package com.eomcs.basic.ex04;

public class Exam0580 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    //System.out.println(arr[0]);
    arr[0] = 100;
    
    arr = new int[] {200, 200, 200};
    
    for(int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
