package com.cauchy.mybatis.po;

import java.util.List;

public class UserQueryVo {
	// 在这里封装所需的查询条件：
	private List ids;
	public List getIds() {
		return ids;
	}
	public void setIds(List ids) {
		this.ids = ids;
	}
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
