package com.cauchy.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cauchy.mybatis.po.User;
import com.cauchy.mybatis.po.UserCustom;
import com.cauchy.mybatis.po.UserQueryVo;

public class UserMapperTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindUserById() throws Exception {
		
		// 创建UserMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 调用UserMapper的方法：
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testFindUserByName() throws Exception {
		
		// 创建UserMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 调用UserMapper的方法：
		List<User> list = userMapper.findUserByName("朱");
		System.out.println(list);
	}
	@Test
	public void testFindUserList()throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 创建包装对象：
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("M");
		userQueryVo.setUserCustom(userCustom);
		// 调用方法：
		List<UserCustom> list = userMapper.findUserList(userQueryVo);
		System.out.println(list);
	}
	@Test 
	public void testFindUserCount() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 创建包装对象：
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("M");
		userCustom.setUserName("朱");
		userQueryVo.setUserCustom(userCustom);
		// 调用方法：
		int count = userMapper.findUserCount(userQueryVo);
		System.out.println("count is :"+ count);
	}
	@Test 
    public void testFindUserByIdResultMap() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用方法：
        User user = userMapper.findUserByIdResultMap(3);
        System.out.println(user);
    }
	@Test
	public void testFindUserList2()throws Exception{
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	    // 创建包装对象：
	    UserQueryVo userQueryVo = new UserQueryVo();
	    UserCustom userCustom = new UserCustom();
	    userCustom.setSex("M");
	    // 要传入多个id
	    List<Integer> ids = new ArrayList<Integer>();
	    ids.add(1);
	    ids.add(6);
	    ids.add(10);
	    // 将IDS传入
	    userQueryVo.setIds(ids);
	    userQueryVo.setUserCustom(userCustom);
	    // 调用方法：
	    List<UserCustom> list = userMapper.findUserList(userQueryVo);
	    System.out.println(list);
	}
}
