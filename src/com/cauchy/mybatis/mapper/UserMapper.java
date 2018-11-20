package com.cauchy.mybatis.mapper;

import java.util.List;

import com.cauchy.mybatis.po.User;

public interface UserMapper {
	// 查询用户
	public User findUserById(int id)throws Exception;
	// 根据用户名返回用户列表
	public List<User> findUserByName(String name)throws Exception;
	// 插入用户
	public void insertUser(User user)throws Exception;
	// 删除用户：
	public void deleteUser(int id)throws Exception;
}
