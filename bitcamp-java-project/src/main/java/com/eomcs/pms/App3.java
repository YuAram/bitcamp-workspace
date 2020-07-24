package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  static class Work {
    String project;
    int no;
    String contents;
    Date dueDate;
    String state;
    String manager;
  }
  
  static int count = 0;
  static final int MAX_LENGTH = 50;
  
  static Work[] works = new Work[MAX_LENGTH];

  public static void main(String[] args) {

    System.out.println("[작업]");

    inputMembers();
    
    System.out.println("--------------------------------");

    outputMembers();
  }

  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Work w = new Work();
      
      System.out.print("프로젝트? ");
      w.project = keyInput.nextLine();

      System.out.print("번호? ");
      w.no = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("내용? ");
      w.contents = keyInput.nextLine();
      
      System.out.print("완료일? ");
      w.dueDate = Date.valueOf(keyInput.nextLine());
      
      System.out.print("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
      w.state = keyInput.nextLine();
      
      switch (w.state) {
        case "0":
          w.state = "신규";
          break;
        case "1":
          w.state = "진행중";
          break;
        default:
          w.state = "완료";
          break;
      }
      
      System.out.print("담당자? ");
      w.manager = keyInput.nextLine();  
      
      works[i] = w;
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      
      if(response.equalsIgnoreCase("y") == false) {
        break; // 반복문 중지
      } 
    }
    keyInput.close();
  }

  static void outputMembers() { 
    for(int i = 0; i < count; i++) {
      Work w = works[i];
      System.out.printf("프로젝트: %s\n", w.project);
      System.out.printf("번호: %d\n", w.no);
      System.out.printf("내용: %s\n", w.contents);
      System.out.printf("완료일: %s\n", w.dueDate.toString());
      System.out.printf("상태: %s\n", w.state);
      System.out.printf("담당자: %s\n", w.manager);
      System.out.println();
    }
  }
}
