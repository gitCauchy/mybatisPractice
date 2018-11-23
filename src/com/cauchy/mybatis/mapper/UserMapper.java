package com.cauchy.mybatis.mapper;

import java.util.List;
import com.cauchy.mybatis.po.User;
import com.cauchy.mybatis.po.UserCustom;
import com.cauchy.mybatis.po.UserQueryVo;

public interface UserMapper {
	// 根据id来查询用户信息 
	public User findUserById(int id) throws Exception;
	// 根据用户名返回用户列表
	public List<User> findUserByName(String name) throws Exception;
	// 插入用户
	public void insertUser(User user) throws Exception;
	// 删除用户 
	public void deleteUser(int id)throws Exception;
	// 用户信息的综合查询
	public List<UserCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
	// 用户综合信息的总数查询：
	public int findUserCount(UserQueryVo userQueryVo)throws Exception;
	// 使用resultMap查询
	public User findUserByIdResultMap(int id) throws Exception;
}