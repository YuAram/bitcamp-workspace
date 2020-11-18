package com.eomcs.pms.service;

import com.eomcs.pms.dao.BoardDao;

public class DefaultBoardService implements BoardService {

  BoardDao boardDao;

  public DefaultBoardService(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
}
