package com.eomcs.oop.ex03;

public class Exam0120 {
  public static void main(String[] args) {

    // 성적 데이터를 설계할 클래스이기 때문에 그에 맞는 이름 사용
    class Score {
      // 여러 명의 구별되는 성적 데이터를 저장하기 위해
      // 인스턴스 변수로 메모리 설계
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float average;
    }

    // 저장하고 싶은 데이터 개수 만큼 인스턴스를 생성
    Score s1 = new Score(); // 1명
    Score s2 = new Score();
    Score s3 = new Score();

    //각 인스턴스에 한 명의 성적 데이터를 저장하라!
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.average = s1.sum / 3f;

    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 100;
    s2.math = 100;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.average = s2.sum / 3f;

    s3.name = "유관순";
    s3.kor = 100;
    s3.eng = 90;
    s3.math = 60;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.average = s3.sum / 3f;
  }
}
