package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.println("[작업]");
    
    //System.out.printf("프로젝트: %s\n", "미니 프로젝트 관리 시스템 개발");
    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();
    
    //System.out.printf("번호: %d\n", 1);
    System.out.print("번호? ");
    String number = keyInput.nextLine();
    int no = Integer.parseInt(number);
        
    //System.out.printf("내용: %s\n", "요구사항 수집");
    System.out.print("내용? ");
    String contents = keyInput.nextLine();
    
    //System.out.printf("완료일: %s\n", "2020-01-20");
    System.out.print("완료일? ");
    //String dueDate = keyInput.nextLine();
    java.sql.Date dueDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    //System.out.printf("상태: %s\n", "진행중");
    System.out.print("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    String state = keyInput.nextLine();
//    if(state.equals("0")) {
//      state = "신규";
//    } else if(state.equals("1")) {
//      state = "진행중";
//    } else if(state.equals("2")) {
//      state = "완료";
//    } else {
//      state = "### Input Error";
//    }
    switch(state) {
    case "0":
      state = "신규";
      break;
    case "1":
      state = "진행중";
      break;
    default:
      state = "완료";
      break;
    }
    
    //System.out.printf("담당자: %s\n", "홍길동");    
    System.out.print("담당자? ");
    String manager = keyInput.nextLine();
    
    System.out.println("--------------------------------");
    
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("완료일: %s\n", dueDate.toString());
    System.out.printf("상태: %s\n", state);
    System.out.printf("담당자: %s\n",manager);
  }
}
