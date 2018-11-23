package com.cauchy.mybatis.po;

import java.util.List;

// 在这类中封装所需的查询条件
public class UserQueryVo {
	// 用户的查询条件
	private UserCustom userCustom;
	private List<Integer> ids;
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
}
