package com.cauchy.mybatis.po;

public class UserQueryVo {
	// 在这里封装所需的查询条件：
	//用户的查询条件：
	private UserCustomer userCustomer;
	// 其他查询条件：
	public UserCustomer getUserCustomer() {
		return userCustomer;
	}
	public void setUserCustomer(UserCustomer userCustomer) {
		this.userCustomer = userCustomer;
	}
}
