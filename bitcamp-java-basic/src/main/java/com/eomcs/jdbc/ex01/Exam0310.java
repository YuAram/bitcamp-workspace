package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0310 {
  public static void main(String[] args) throws Exception{

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb","study","1111");

        java.sql.Statement stmt = con.createStatement();) {

      System.out.println(stmt.getClass().getName());

      int count = stmt.executeUpdate( //
          "insert into x_board(title,contents) values('제목10','내용')");
      System.out.printf("%d 개 입력 성공!", count);
    }
  }
}
