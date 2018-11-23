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

import com.cauchy.mybatis.po.Order;
import com.cauchy.mybatis.po.OrderCustom;
import com.cauchy.mybatis.po.User;

public class OrderCustomMapperTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp()throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindOrderUsers() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		// 调用方法：
		List <OrderCustom> list = orderCustomMapper.findOrderUser();
		System.out.println(list);
		sqlSession.close();
	}
	@Test
	public void testFindOrderUsersResultMap()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象：
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		//调用方法
		List<Order> list = orderCustomMapper.findOrderUserResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	@Test
	public void testFindOrderandOrderDetailResultMap()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象：
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		// 调用方法
		List<Order> list = orderCustomMapper.findOrderAndOrderDetailResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	@Test
	public void testFindUserAndItemsResultMap()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象：
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		// 调用方法
		List<User>list = orderCustomMapper.findUserAndItemsResultMap();
		System.out.println(list);
		sqlSession.close();
	}
}