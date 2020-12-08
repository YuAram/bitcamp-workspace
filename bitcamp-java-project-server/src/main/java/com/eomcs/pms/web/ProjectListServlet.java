package com.eomcs.pms.web;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.io.PrintWriter;
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;

@WebServlet("/project/list")
public class ProjectListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    ProjectService projectService =
        (ProjectService) ctx.getAttribute("projectService");

    response.setContentType("text/html;charset=UTF-8");

    request.getRequestDispatcher("/header").include(request, response);

    try {
      List<Project> list = null;

<<<<<<< HEAD
=======
      List<Project> list = null;

>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
      String keyword = request.getParameter("keyword");
      String keywordTitle = request.getParameter("keywordTitle");
      String keywordOwner = request.getParameter("keywordOwner");
      String keywordMember = request.getParameter("keywordMember");
<<<<<<< HEAD
=======

      if (keyword != null) {
        list = projectService.list(keyword);

      } else if (keywordTitle != null) {
        HashMap<String,Object> keywordMap = new HashMap<>();
        keywordMap.put("title", keywordTitle);
        keywordMap.put("owner", keywordOwner);
        keywordMap.put("member", keywordMember);

        list = projectService.list(keywordMap);

      } else {
        list = projectService.list();
      }
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4

      if (keyword != null) {
        list = projectService.list(keyword);

      } else if (keywordTitle != null) {
        HashMap<String,Object> keywordMap = new HashMap<>();
        keywordMap.put("title", keywordTitle);
        keywordMap.put("owner", keywordOwner);
        keywordMap.put("member", keywordMember);

<<<<<<< HEAD
        list = projectService.list(keywordMap);
=======
      for (Project project : list) {
        if (project.getState() == 0) continue;

        StringBuilder members = new StringBuilder();
        for (Member member : project.getMembers()) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(member.getName());
        }
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4

      } else {
        list = projectService.list();
      }

      request.setAttribute("list", list);
      request.getRequestDispatcher("/project/list.jsp").include(request, response);

<<<<<<< HEAD
    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error.jsp").forward(request, response);
=======
      out.println("<p>");
      out.println("<form action='list' method='get'>");
      out.printf("검색어: <input type='text' name='keyword' value='%s'>\n",
          keyword != null ? keyword : "");
      out.println("<button>검색</button>");
      out.println("</form>");
      out.println("</p>");

      out.println("<hr>");
      out.println("<h2>상세 검색</h2>");
      out.println("<p>");
      out.println("<form action='list' method='get'>");
      out.printf("프로젝트명: <input type='text' name='keywordTitle' value='%s'><br>\n",
          keywordTitle != null ? keywordTitle : "");
      out.printf("관리자: <input type='text' name='keywordOwner' value='%s'><br>\n",
          keywordOwner != null ? keywordOwner : "");
      out.printf("멤버: <input type='text' name='keywordMember' value='%s'><br>\n",
          keywordMember != null ? keywordMember : "");
      out.println("<button>검색</button>");
      out.println("</form>");
      out.println("</p>");

    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error").forward(request, response);
      return;
>>>>>>> 2ba770c74361a3b40d77d461b6b3d161e8ba71b4
    }
  }
}
