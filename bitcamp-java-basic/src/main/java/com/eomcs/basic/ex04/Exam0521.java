package com.eomcs.basic.ex04;

public class Exam0521 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 100;
    arr[1] = 90;
    arr[2] = 80;
    arr[3] = 70;
    arr[4] = 60;
    
    int sum = 0;
    
    for(int i=0; i<arr.length; i++) {
      sum += arr[i];
    }
    
    System.out.println(sum);
  }
}
