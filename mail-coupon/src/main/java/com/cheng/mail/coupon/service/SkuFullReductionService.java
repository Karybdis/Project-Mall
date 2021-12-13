package com.cheng.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.to.SkuReductionTo;
import com.cheng.common.utils.PageUtils;
import com.cheng.mail.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 18:03:04
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

