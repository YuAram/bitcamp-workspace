package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

public class AppInitListener implements ApplicationContextListener {
  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("환영합니다~");
  }

  @Override
  public void contextDestoryed(Map<String,Object> context) {
    System.out.println("종료합니다!");
  }
}

