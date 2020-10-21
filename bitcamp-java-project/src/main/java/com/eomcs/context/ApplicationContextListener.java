package com.eomcs.context;

import java.util.Map;

public interface ApplicationContextListener {

  void contextInitialized(Map<String,Object> context);

  void contextDestoryed(Map<String,Object> context);
}
