package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0410 {
  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();

    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      // 사용자로부터 첨부파일 입력 받기
      while (true) {
        System.out.print("첨부파일:(완료는 엔터@!) ");
        String filename = keyScan.nextLine();
        if (filename.length() == 0) {
          break;
        }
        files.add(filename);
      }
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        // 게시글 입력 처리 객체
        PreparedStatement boardstmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?, ?)");
        // 첨부파일 입력 처리 객체
        PreparedStatement filestmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?, ?)")) {

      boardstmt.setString(1, title);
      boardstmt.setString(2, contents);
      int count = boardstmt.executeUpdate();
      System.out.printf("%d 개 입력 성공!", count);

      int fileCount = 0;
      for (String filename : files) {
        filestmt.setString(1, filename);
        filestmt.setInt(2, 0);
        filestmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d 개 첨부파일 입력 성공!", fileCount);

    }
  }
}