package com.eomcs.jdbc.ex02;

import java.sql.DriverManager;
import java.util.Scanner;

public class Exam0130 {
  public static void main(String[] args) throws Exception{
    int no = 0;
    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("번호 ? ");
      no = Integer.parseInt(keyScan.nextLine());
    }

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb","study","1111");
        java.sql.Statement stmt = con.createStatement();

        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board where board_id=" + no)) {


      if (rs.next()) {
        System.out.printf("제목 : %s\n", rs.getString("title"));
        System.out.printf("내용 : %s\n", rs.getString("contents"));
        System.out.printf("등록일 : %s\n", rs.getDate("created_date"));
        System.out.printf("조회수 : %s\n", rs.getInt("view_count"));
      } else {
        System.out.println("해당 번호의 겟미ㅜㄹ이 존재하지 않습니다.");
      }
    }
  }
}
