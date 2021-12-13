package com.cheng.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.mail.product.entity.SpuInfoDescEntity;
import com.cheng.mail.product.entity.SpuInfoEntity;
import com.cheng.mail.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 17:11:22
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);

    PageUtils queryPageCondition(Map<String, Object> params);

    void up(Long spuId);
}

