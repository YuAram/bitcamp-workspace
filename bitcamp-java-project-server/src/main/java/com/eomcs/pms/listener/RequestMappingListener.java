package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.service.BoardService;
import com.eomcs.pms.service.MemberService;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.pms.service.TaskService;

// 클라이언트 요청을 처리할 커맨드 객체를 준비한다.
public class RequestMappingListener implements ApplicationContextListener {

  @SuppressWarnings("unchecked")
  @Override
  public void contextInitialized(Map<String,Object> context) {
    try {
    // context 보관소에 저장되어 있는 서비스 객체를 꺼낸다.
    BoardService boardService = (BoardService) context.get("boardService");
    MemberService memberService = (MemberService) context.get("memberService");
    ProjectService projectService = (ProjectService) context.get("projectService");
    TaskService taskService = (TaskService) context.get("taskService");
    
    Member member = memberService.get("xxx", "xxx");
    context.put("loginUser", member);

    // 클라이언트의 요청을 처리할 커맨드 객체를 생성한다.
    context.put("/board/add", new BoardAddCommand(boardService));
    context.put("/board/list", new BoardListCommand(boardService));
    context.put("/board/detail", new BoardDetailCommand(boardService));
    context.put("/board/update", new BoardUpdateCommand(boardService));
    context.put("/board/delete", new BoardDeleteCommand(boardService));

//    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    context.put("/member/add", new MemberAddCommand(memberService));
//    context.put("/member/list", memberListCommand);
    context.put("/member/detail", new MemberDetailCommand(memberService));
//    context.put("/member/update", new MemberUpdateCommand(memberList));
    context.put("/member/delete", new MemberDeleteCommand(memberService));

//    context.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
//    context.put("/project/list", new ProjectListCommand(projectList));
//    context.put("/project/detail", new ProjectDetailCommand(projectList));
//    context.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
//    context.put("/project/delete", new ProjectDeleteCommand(projectList));
//
//    context.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
//    context.put("/task/list", new TaskListCommand(taskList));
//    context.put("/task/detail", new TaskDetailCommand(taskList));
//    context.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
//    context.put("/task/delete", new TaskDeleteCommand(taskList));
//
//    context.put("/hello", new HelloCommand());
//
//    context.put("/calc", new CalculatorCommand());
    } catch (Exception e) {
      System.out.println("서비스 객체를 준비하는 중에 오류 발생!");
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
  }
}
