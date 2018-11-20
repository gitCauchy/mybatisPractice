package com.cauchy.mybatis.dao;

import com.cauchy.mybatis.po.User;

public interface UserDao {
	// 查询用户
	public User findUserById(int id) throws Exception;
	// 添加用户信息
	public void insertUser(User user) throws Exception;
	// 删除用户信息
	public void deleteUser(int id) throws Exception;
}
