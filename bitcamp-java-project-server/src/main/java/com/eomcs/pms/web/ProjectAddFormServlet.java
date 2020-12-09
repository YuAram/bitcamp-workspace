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

@WebServlet("/project/form")
public class ProjectAddFormServlet extends HttpServlet {
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
    out.println("<head>");
    out.println("<title>프로젝트생성</title></head>");
    out.println("<body>");

    request.getRequestDispatcher("/header").include(request, response);

>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
    try {
      List<Member> members = memberService.list();
      request.setAttribute("members", members);
      request.getRequestDispatcher("/project/form.jsp").include(request, response);

    } catch (Exception e) {
      request.setAttribute("exception", e);
<<<<<<< HEAD
      request.getRequestDispatcher("/error.jsp").forward(request, response);
=======
      request.getRequestDispatcher("/error").forward(request, response);
      return;
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
    }
  }
}
