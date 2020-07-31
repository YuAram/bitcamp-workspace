package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 100;

    String[] project = new String[LENGTH];
    int[] numbers = new int[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] dueDate = new Date[LENGTH];
    int[] state = new int[LENGTH];
    String[] manager = new String[LENGTH];
    int count;

    count = 0;

    System.out.println("[작업]");

    for(int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();

      System.out.print("번호? ");
      numbers[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      contents[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      dueDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태?");
      System.out.println("0: 신규 ");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      state[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("담당자? ");
      manager[i] = keyInput.nextLine();

      System.out.println();

      System.out.print("계속 입력 하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }

    System.out.println("--------------------------------");

    for(int i = 0; i < count; i++) {
      String stateStr;

      System.out.printf("프로젝트: %s\n", project[i]);
      System.out.printf("번호: %s\n", numbers[i]);
      System.out.printf("내용: %s\n", contents[i]);
      System.out.printf("완료일: %s\n", dueDate[i]);
      switch(state[i]) {
        case 0:
          stateStr = "신규";
          break;
        case 1:
          stateStr = "진행중";
          break;
        default:
          stateStr = "완료";
          break;
      }
      System.out.printf("상태: %s\n", stateStr);
      System.out.printf("담당자: %s\n", manager[i]);

      System.out.println();
    }
  }
}
