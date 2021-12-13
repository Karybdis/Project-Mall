package com.cheng.mail.member.dao;

import com.cheng.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 18:31:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
