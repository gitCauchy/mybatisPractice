package com.cauchy.mybatis.mapper;

import java.util.List;

import com.cauchy.mybatis.po.Order;
import com.cauchy.mybatis.po.OrderCustom;

public interface OrderCustomMapper {
	// 查询订单以及用户
	public List<OrderCustom> findOrderUser()throws Exception;
	// ResultMap实现上一方法：
	public List<Order> findOrderUserResultMap()throws Exception;
}
