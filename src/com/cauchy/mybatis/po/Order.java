package com.cauchy.mybatis.po;

import java.util.Date;
import java.util.List;

public class Order {
	private Integer id;
	private Integer userId;
	private String number;
	private Date createTime;
	private String note;
	private User user;
	private List<OrderDetail> orderDetailList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime
				+ ", note=" + note + ", user=" + user + ", orderDetailList=" + orderDetailList + "]";
	}
	
	
}
