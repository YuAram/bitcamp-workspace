package com.eomcs.basic.ex07;

// Call by reference
public class Exam0320 {
  public static void main(String[] args) {
    int[] arr = {100, 200};
    swap(arr);

    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }
}
