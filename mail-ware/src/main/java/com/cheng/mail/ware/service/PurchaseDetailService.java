package com.cheng.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.mail.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 18:32:56
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {
    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

