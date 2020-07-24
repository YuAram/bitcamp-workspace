package com.eomcs.pms;


import java.util.Scanner;
import java.sql.Date;

public class App2 {

  static class Project {
    int no;
    String name;
    String contents;
    Date startDate;
    Date endDate;
    String creator;
    String teamMem;
  }

  static int count = 0;
  static final int MAX_LENGTH = 50;
  
  static Project[] projects = new Project[MAX_LENGTH];

  public static void main(String[] args) {

    System.out.println("[프로젝트]");

    inputMembers();

    System.out.println("--------------------------------");

    outputMembers();
  }

  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Project p = new Project();
     
      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      p.name = keyInput.nextLine();

      System.out.print("내용? ");
      p.contents = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      p.endDate = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.creator = keyInput.nextLine();

      System.out.print("팀원? ");
     p.teamMem = keyInput.nextLine();
     
     projects[i] = p;
      
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
      Project p = projects[i];
      System.out.printf("번호: %d\n", p.no);
      System.out.printf("프로젝트명: %s\n", p.name);
      System.out.printf("내용: %s\n", p.contents);
      System.out.printf("시작일: %s\n", p.startDate.toString());
      System.out.printf("종료일: %s\n", p.endDate.toString());
      System.out.printf("만든이: %s\n", p.creator);
      System.out.printf("팀원: %s\n", p.teamMem);
      System.out.println();
    }
  }
}
