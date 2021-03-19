package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zx
 * @email 2674671187@qq.com
 * @date 2021-03-19 21:30:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
