package com.eomcs.pms.dao.mariadb;

import java.sql.Connection;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.pms.domain.Task;

public class TaskDaoImpl implements com.eomcs.pms.dao.TaskDao {

  Connection con;
  SqlSessionFactory sqlSessionFactory;

  public TaskDaoImpl(Connection con, SqlSessionFactory sqlSessionFactory) {
    this.con = con;
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Task task) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

      return sqlSession.insert("TaskDao.insert", task);
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.delete("TaskDao.delete", no);
    }
  }

  @Override
  public int deleteByProjectNo(int projectNo) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.delete("TaskDao.deleteByProjectNo", projectNo);
    }
  }

  @Override
  public Task findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("TaskDao.findByNo", no);
    }
  }


  @Override
  public List<Task> findAll() throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      List<Task> tasks = sqlSession.selectList("TaskDao.findAll");
      return tasks;
    }
  }

  @Override
  public int update(Task task) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      int count = sqlSession.update("TaskDao.update", task);
      if (count == 0) {
        return 0;
      }
      return count;
    }
  }
}
