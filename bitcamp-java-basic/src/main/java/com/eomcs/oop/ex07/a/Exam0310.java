package com.eomcs.oop.ex07.a;

class Score3 {
  String name;

  private int kor;
  private int eng;
  private int math;

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getMath() {
    return this.math;
  }

  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}
public class Exam0310 {
  public static void main(String[] args) {
    Score3 s3 = new Score3();

    s3.name = "아람유";
    s3.setKor(100);
    s3.setEng(90);
    s3.setMath(80);

    s3.setEng(100);
    s3.setMath(100);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s3.name,
        s3.getKor(), s3.getEng(), s3.getMath(),
        s3.getSum(), s3.getAver());
  }
}

