package com.eomcs.pms;

import java.sql.Date;
// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;


public class App {

  public static void main(String[] args) {

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date now;
    }

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");

    final int MAX_LENGTH = 50;

    Member[] members = new Member[MAX_LENGTH];

    long currentMillis = 0;
    int count = 0;

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;

      Member m = new Member();

      System.out.print("번호? ");
      m.no = keyInput.nextInt(); // nextInt()는 입력 값 중에서 숫자만 뽑아간다.
      keyInput.nextLine(); // 숫자 뒤에 남아 있는 CR/LF 값 읽어서 버리기

      System.out.print("이름? ");
      m.name = keyInput.nextLine();

      System.out.print("이메일? ");
      m.email = keyInput.nextLine();

      System.out.print("암호? ");
      m.password = keyInput.nextLine();

      System.out.print("사진? ");
      m.photo = keyInput.nextLine();

      System.out.print("전화? ");
      m.tel = keyInput.nextLine();

      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 경과된 밀리초
      m.now = new Date(currentMillis);
      System.out.println();

      members[i] = m;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if(response.equalsIgnoreCase("y") == false) {
        break; // 반복문 중지
      }
    }

    keyInput.close();

    System.out.println("--------------------------------");
    for(int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no,
          m.name,
          m.email,
          m.tel,
          m.now.
          toString());
    }
  }
}
