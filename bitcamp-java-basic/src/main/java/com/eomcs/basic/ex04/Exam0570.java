package com.eomcs.basic.ex04;

public class Exam0570 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    
    arr[0] = 100;
    arr[1] = 90;
    arr[2] = 80;
    arr[3] = 70;
    arr[4] = 60;
    
    int arr2[] = new int[] {100, 90, 80, 70, 60};
    
    int arr3[] = {100, 90, 80, 70, 60};
    
    int[] arr4;
    
    arr4 = arr2;

    System.out.println(arr4[2]);
    
    int[] arr5;
    arr5 = new int[] {0,0,0,0,0};
    
    System.out.println(arr5[2]);
  }
}
