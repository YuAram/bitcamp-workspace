package com.eomcs.basic.ex06;

public class Exam0241 {
  public static void main(String[] args) {
    int level = 1;

    final int GUEST = 0, MEMBER = 1, ADMIN = 2;

    switch (level) {
      case GUEST:
        System.out.println("조회 가능 ");
        break;
      case MEMBER:
        System.out.println("글작성 가능 ");
        break;
      case ADMIN:
        System.out.println("변경 삭제 가능 ");
        break;
    }
  }
}
