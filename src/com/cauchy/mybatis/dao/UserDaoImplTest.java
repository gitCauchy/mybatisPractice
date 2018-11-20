package com.cauchy.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cauchy.mybatis.po.User;

public class UserDaoImplTest {
	private SqlSessionFactory sqlSessionFactory;
	public void setUp()throws IOException{
		// 配置文件
		String resource = "sqlMapConfig.xml";
		// 得到配置文件流：
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建对话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindUserById()throws Exception{
		setUp();
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
}
