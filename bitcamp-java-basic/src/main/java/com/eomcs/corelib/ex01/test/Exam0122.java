package com.eomcs.corelib.ex01.test;

public class Exam0122 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }

  }
  public static void main(String[] args) {
    Score s1 = new Score("아람유", 100, 10, 100);

    String str = s1.toString();

    System.out.println(str);
  }
}
