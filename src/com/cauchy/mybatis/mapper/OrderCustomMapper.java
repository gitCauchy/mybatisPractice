package com.cauchy.mybatis.mapper;

import java.util.List;

import com.cauchy.mybatis.po.OrderCustom;
import com.cauchy.mybatis.po.Orders;
import com.cauchy.mybatis.po.User;

public interface OrderCustomMapper {
	
	public List<OrderCustom> findOrderUser()throws Exception;
	
	public List<Orders> findOrderUserResultMap()throws Exception;
	
	public List<Orders> findOrderAndOrderDetailResultMap() throws Exception;
	
	public List<User> findUserAndItemsResultMap()throws Exception;
}
