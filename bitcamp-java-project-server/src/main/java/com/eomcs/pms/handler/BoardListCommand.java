package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListCommand extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService = (BoardService) ctx.getAttribute("boardService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>게시물 목록</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>게시물 목록</h1>");

      List<Board> list = boardService.list();
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("<tr>");
      out.println("<th>번호</th>");
      out.println("<th>제목</th>");
      out.println("<th>작성자</th>");
      out.println("<th>등록일</th>");
      out.println("<th>조회수</th>");
      out.println("</tr>");
      out.println("</thead>");
      
      out.println("<tbody>");
      for (Board board : list) {
        out.println("<tr>");
        out.printf("<td>%d</td>", board.getNo());
        out.printf("<td>%s</td>", board.getTitle());
        out.printf("<td>%s</td>", board.getWriter().getName());
        out.printf("<td>%s</td>", board.getRegisteredDate());
        out.printf("<td>%d</td>", board.getViewCount());
        out.println("</tr>");
      }
      out.println("</tbody>");
      out.println("</table>");
    } catch (Exception e) {
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());
      
      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      
      out.printf("<pre>%s</pre>\n", errOut.toString());
    }
    out.println("</body>");
    out.println("</html>");
  }

}
