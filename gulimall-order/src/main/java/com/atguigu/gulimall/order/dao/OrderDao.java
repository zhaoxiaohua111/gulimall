package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zx
 * @email 2674671187@qq.com
 * @date 2021-03-19 21:51:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
