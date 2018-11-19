package com.cauchy.mybatis.first;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import  org.junit.Test;

import com.cauchy.mybatis.po.User;

public class MybatisFirst {
	@Test
	public void findUserById() throws IOException{
		// 配置文件
		String resource = "sqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建对话工厂：
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话：
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 查询：
		User user = sqlSession.selectOne("test.findUserById",1);
		System.out.println(user);
		sqlSession.close();
	}
	@Test
	public void findUserByName() throws IOException{
		// 配置文件
		String resource = "sqlMapConfig.xml";
		// 得到配置文件流：
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话 
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 查询
		User user = sqlSession.selectOne("test.findUserByName","李逵");
		System.out.println(user);
		sqlSession.close();
		
	}
}
