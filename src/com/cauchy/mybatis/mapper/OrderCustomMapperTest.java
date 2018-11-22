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

import com.cauchy.mybatis.po.OrderCustom;
import com.cauchy.mybatis.po.Orders;
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
		// 调用方法
		List<Orders> list = orderCustomMapper.findOrderUserResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	@Test
	public void testFindOrderandOrderDetailResultMap()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象：
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		// 调用方法
		List<Orders> list = orderCustomMapper.findOrderAndOrderDetailResultMap();
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
	@Test
	public void testFindOrderAndUserLazyLoading()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建代理对象：
		OrderCustomMapper orderCustomMapper = sqlSession.getMapper(OrderCustomMapper.class);
		// 调用方法
		List<Orders>list = orderCustomMapper.findOrderAndUserLazyLoading();
		// 遍历订单列表
		for(Orders order :list) {
			User user = order.getUser();
			System.out.println(user);
		}
		sqlSession.close();
		
	}
	@Test
	public void testCache2() throws Exception{
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		SqlSession sqlSession3 = sqlSessionFactory.openSession();
		UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
		UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
		// 第一次发起查询请求，查询id为1的用户
		User user1 = userMapper1.findUserById(2);
		System.out.println(user1);
		// 关闭操作，才将数据写到二级缓存中
		sqlSession1.close();
		// 第二次发起请求，查询id为1用户
		User user2 = userMapper2.findUserById(2);
		System.out.println(user2);
		sqlSession2.close();
	}
}
