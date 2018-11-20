package com.cauchy.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cauchy.mybatis.po.User;

public class UserDaoImpl implements UserDao{
	// 需要注入SqlSessionFactory
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public User findUserById(int id) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById",id);
		sqlSession.close();
		return user;
	}
	public void insertUser(User user) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("test.insertUser",user);
		sqlSession.commit();
		sqlSession.close();
	}
	public void deleteUser(int id) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("test.deleteUser",id);
		sqlSession.commit();
		sqlSession.close();
	}
}
