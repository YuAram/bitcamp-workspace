package com.eomcs.basic.ex06;

import java.util.ArrayList;
import java.util.Date;

public class Exam0410 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}
    ArrayList scores = new ArrayList();
    scores.add(100);
    scores.add(3.14f);
    scores.add("오호라");
    scores.add(true);
    scores.add("hi");
    scores.add(new Date());

    //    for (int i = 0; i < scores.size(); i++) {
    //      System.out.println(scores.get(i));
    //    }
    for (Object value : scores) {
      System.out.println(value);
    }

    //    for (int value : scores) {
    //      System.out.println(value);
    //    }

    //    for (int i = 0; i < scores.length; i++) {
    //      int value = scores[i];
    //      System.out.println(value);
    //    }
  }
}
