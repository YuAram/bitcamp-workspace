package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0350 {
  public static void main(String[] args) throws Exception{

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb","study","1111");

        java.sql.Statement stmt = con.createStatement();) {

      System.out.println(stmt.getClass().getName());

      int count = stmt.executeUpdate( //
          "update x_board set view_count = view_count + 1 "
          + "where board_id = 4");
      System.out.printf("%d 개 변경 성공!", count);
    }
  }
}
