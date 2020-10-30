package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0520 {
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

        // => 게시글을 입력할 떄 자동 생성된 PK 값을 받겠다고 설정한다.
        PreparedStatement boardstmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?, ?)",
            Statement.RETURN_GENERATED_KEYS);

        // 첨부파일 입력 처리 객체
        PreparedStatement filestmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?, ?)")) {

      // 한 단위로 수행해야 할 작업이 있다면,
      // COMMIT 할 때까지 실제 테이블에 적용하지 않도록
      // auto COMMIT을 취소하고 수동 커밋 상태로 만든다.
      con.setAutoCommit(false);

      boardstmt.setString(1, title);
      boardstmt.setString(2, contents);
      int count = boardstmt.executeUpdate();
      System.out.printf("%d 개 입력 성공!\n", count);

      // 위에서 입력한 게시글의 PK 값을 알아내기
      ResultSet keyRS = boardstmt.getGeneratedKeys();
      keyRS.next(); // PK가 들어있는 레코드를 한 개 가져온다.
      int boardId = keyRS.getInt(1);

      int fileCount = 0;
      for (String filename : files) {
        filestmt.setString(1, filename);

        filestmt.setInt(2, boardId);

        filestmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d 개 첨부파일 입력 성공!", fileCount);

      con.commit();

    } catch (Exception e) {
      System.out.println("게시물 입력 중 오류 발생!");

      // 만약에 입력 도중에 실패했다면,
      // 현재까지 작업한 결과를 모두 취소하라고 DBMS에게 통보한다.
      // => commit()을 호출하지 않고 커낵션 객체를 닫으면,
      //    DBMS는 그 커낵션을 통해 수행한 모든 작업을 rollback 한다.
      // => 따라서 따로 커넥션 객체에 대해 rollback()을 호출할 필요가 없다.
      //con.rollback();
    }
  }
}