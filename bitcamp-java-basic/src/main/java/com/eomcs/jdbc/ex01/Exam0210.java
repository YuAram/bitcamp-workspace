package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0210 {
  public static void main(String[] args) throws Exception{

    java.sql.Connection con = null;

    try {

      con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111"
          );
      System.out.println(con.getClass().getName());

    } finally {
      try {
        con.close();
      } catch (Exception e) {

      }
      System.out.println("DBMS와 연결 해제됨!");
    }
  }
}
