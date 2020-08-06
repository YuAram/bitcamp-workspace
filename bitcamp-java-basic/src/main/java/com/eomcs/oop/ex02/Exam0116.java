package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {

  public static void main(String[] args) {

    Score s1; // 스택에 변수 생
    s1 = new Score(); // 힙에 s1 인스턴스 생성

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.compute(s1);

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute(s2);

    printScore(s1);
    System.out.println("------------------------------");
    printScore(s2);
  }

  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}

