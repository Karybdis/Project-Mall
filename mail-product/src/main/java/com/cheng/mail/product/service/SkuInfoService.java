package com.cheng.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.mail.product.entity.SkuInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 17:11:22
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);
}

