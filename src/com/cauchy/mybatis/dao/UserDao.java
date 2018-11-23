package com.cauchy.mybatis.dao;

import com.cauchy.mybatis.po.User;

public interface UserDao {
	// 根据id来查询用户信息
	public User findUserById(int id) throws Exception;
	// 添加用户的信息
	public void insertUser(User user) throws Exception;
	// 删除用户的信息
	public void deleteUser(int id) throws Exception;
}