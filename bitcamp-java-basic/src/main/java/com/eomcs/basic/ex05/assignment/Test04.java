package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제2 
//- 다음 int 변수에 들어 있는 값을
//  각 자릿수의 10 진수 값을 역순으로 출력하라.
//실행 예)
//값:23459876
//6
//7
//8
//9
//5
//4
//3
//2
public class Test04 {

  public static void main(String[] args) {
    int value = 23459876;
    int[] number = new int[8];
    
    number[7] = (int)(value * 0.0000001);
    number[6] = (int)(value * 0.000001 - number[7] * 10);
    number[5] = (int)(value * 0.00001 - number[7] * 100 - number[6] * 10);
    number[4] = (int)(value * 0.0001 - number[7] * 1000 - number[6] * 100
                        - number[5] * 10);
    number[3] = (int)(value * 0.001 - number[7] * 10000 - number[6] * 1000
                        - number[5] * 100 - number[4] * 10);
    number[2] = (int)(value * 0.01 - number[7] * 100000 - number[6] * 10000
                        - number[5] * 1000 - number[4] * 100 - number[3] * 10);
    number[1] = (int)(value * 0.1 - number[7] * 1000000 - number[6] * 100000
                        - number[5] * 10000 - number[4] * 1000 - number[3] * 100
                        - number[2] * 10);
    number[0] = (int)(value * 1 - number[7] * 10000000 - number[6] * 1000000
                        - number[5] * 100000 - number[4] * 10000 - number[3] * 1000
                        - number[2] * 100 - number[1] * 10);
    
    for(int i=0; i<number.length; i++)
    {
      System.out.println(number[i]);
    }
  }
}