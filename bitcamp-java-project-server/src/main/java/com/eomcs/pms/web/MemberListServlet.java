package com.eomcs.pms.web;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.io.PrintWriter;
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    MemberService memberService =
        (MemberService) ctx.getAttribute("memberService");

    response.setContentType("text/html;charset=UTF-8");
<<<<<<< HEAD
=======
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>회원목록</title></head>");
    out.println("<body>");

    request.getRequestDispatcher("/header").include(request, response);

>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
    try {
      List<Member> list = memberService.list();
<<<<<<< HEAD
      request.setAttribute("list", list);
      request.getRequestDispatcher("/member/list.jsp").include(request, response);
    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error.jsp").forward(request, response);
=======

      out.println("<table border='1'>");
      out.println("<thead><tr>" // table row
          + "<th>번호</th>" // table header
          + "<th>이름</th>"
          + "<th>이메일</th>"
          + "<th>전화</th>"
          + "<th>등록일</th>"
          + "</tr></thead>");

      out.println("<tbody>");

      for (Member member : list) {
        out.printf("<tr>"
            + "<td>%d</td>"
            + "<td><a href='detail?no=%1$d'><img src='../upload/%s_30x30.jpg' alt='[%2$s]'>%s</a></td>"
            + "<td>%s</td>"
            + "<td>%s</td>"
            + "<td>%s</td>"
            + "</tr>\n",
            member.getNo(),
            member.getPhoto(),
            member.getName(),
            member.getEmail(),
            member.getTel(),
            member.getRegisteredDate());
      }
      out.println("</tbody>");
      out.println("</table>");

    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error").forward(request, response);
      return;
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
    }
  }
}
