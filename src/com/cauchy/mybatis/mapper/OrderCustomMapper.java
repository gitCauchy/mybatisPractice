package com.cauchy.mybatis.mapper;

import java.util.List;

import com.cauchy.mybatis.po.OrderCustom;
import com.cauchy.mybatis.po.Orders;

public interface OrderCustomMapper {
	
	public List<OrderCustom> findOrderUser()throws Exception;
	
	public List<Orders> findOrderUserResultMap()throws Exception;
}
