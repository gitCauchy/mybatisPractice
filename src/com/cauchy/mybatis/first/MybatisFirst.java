package com.cauchy.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

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
	public void findUserByName() throws IOException {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建对话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 根据用户的名称来模糊查询
		List<Object> list = sqlSession.selectList("test.findUserByName","朱");
		for(Object user:list) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	@Test
	public void insertUser() throws IOException {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建对话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行插入
		User user = new User();
		user.setUserName("Linux");
		user.setBirthday(new Date());
		user.setSex("M");
		user.setAddress("London");
		sqlSession.insert("test.insertUser", user);
		// 执行提交
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void deleteUser() throws IOException {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建对话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行删除
		sqlSession.delete("test.deleteUser", 13);
		// 执行提交
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void updateUser() throws IOException {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建对话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取对话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setUserName("LinDa");
		user.setBirthday(new Date());
		user.setSex("M");
		user.setAddress("JiNan");
		user.setId(9);
		// 执行删除
		sqlSession.update("test.updateUser", user);
		// 执行提交
		sqlSession.commit();
		sqlSession.close();
	}
}
