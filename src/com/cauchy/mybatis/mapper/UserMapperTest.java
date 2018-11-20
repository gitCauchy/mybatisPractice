package com.cauchy.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cauchy.mybatis.po.User;

public class UserMapperTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp()throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindUserById()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 调用UserMapper的方法：
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testFindUserByName()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findUserByName("Lu");
		System.out.println(list);
	}
}
