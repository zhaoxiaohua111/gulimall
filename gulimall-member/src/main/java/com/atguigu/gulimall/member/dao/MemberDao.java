package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zx
 * @email 2674671187@qq.com
 * @date 2021-03-19 21:43:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
