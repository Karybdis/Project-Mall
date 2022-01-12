package com.cheng.mail.product.vo;

import com.cheng.mail.product.entity.SkuImagesEntity;
import com.cheng.mail.product.entity.SkuInfoEntity;
import com.cheng.mail.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;

@Data
public class SkuItemVo {
    SkuInfoEntity info;
    List<SkuImagesEntity> images;
    List<SkuItemSaleAttrVo> saleAttr;
    SpuInfoDescEntity desp;
    List<SpuItemAttrGroupVo> groupAttrs;
    boolean hasStock=true;
}
