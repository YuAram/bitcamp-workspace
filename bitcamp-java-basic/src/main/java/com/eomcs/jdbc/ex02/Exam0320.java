package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam0320 {
  public static void main(String[] args) throws Exception{

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb","study","1111");
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board order by board_id desc");

        ResultSet rs = stmt.executeQuery()) {

      System.out.println("번호, 제목, 등록일, 조회");
      while(rs.next()) {
        System.out.printf("%d, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));
      }
    }
  }
}
