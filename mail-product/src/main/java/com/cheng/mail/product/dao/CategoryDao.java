package com.cheng.mail.product.dao;

import com.cheng.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 17:11:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
