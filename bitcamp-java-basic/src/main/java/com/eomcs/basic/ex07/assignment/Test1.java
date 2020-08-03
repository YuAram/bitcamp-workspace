package com.eomcs.basic.ex07.assignment;

//# 과제: 단위 행렬을 출력하시오
//
public class Test1 {
  public static void main(String[] args) {
    int[][] arr = new int[6][6];

    // 단위 행렬이 되도록 배열을 초기화 시키시오.
    for (int i = 1; i <= 5; i++) {
      arr[i][i]++;
    }

    System.out.println("----------------------------------");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println();
    }
  }
}