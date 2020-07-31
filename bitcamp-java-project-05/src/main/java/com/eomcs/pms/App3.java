package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    class Task {
      String project;
      int numbers;
      String contents;
      Date dueDate;
      int state;
      String manager;
      int count;
    }

    final int LENGTH = 100;
    Task[] tasks = new Task[LENGTH];

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[작업]");

    int count = 0;

    for(int i = 0; i < LENGTH; i++) {
      count++;

      Task t = new Task();

      System.out.print("프로젝트? ");
      t.project = keyInput.nextLine();

      System.out.print("번호? ");
      t.numbers = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      t.contents = keyInput.nextLine();

      System.out.print("완료일? ");
      t.dueDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태?");
      System.out.println("0: 신규 ");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      t.state = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("담당자? ");
      t.manager = keyInput.nextLine();
      System.out.println();

      tasks[i] = t;

      System.out.print("계속 입력 하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if(!response.equalsIgnoreCase("y")) {
        break;
      }

      System.out.println();
    }

    keyInput.close();
    System.out.println("--------------------------------");

    for(int i = 0; i < count; i++) {
      Task t = tasks[i];

      String stateStr;
      switch(t.state) {
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

      System.out.printf("프로젝트: %s\n", t.project);
      System.out.printf("번호: %s\n", t.numbers);
      System.out.printf("내용: %s\n", t.contents);
      System.out.printf("완료일: %s\n", t.dueDate);
      System.out.printf("상태: %s\n", stateStr);
      System.out.printf("담당자: %s\n", t.manager);

      System.out.println();
    }
  }
}
