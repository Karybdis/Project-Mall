/**
  * Copyright 2021 bejson.com 
  */
package com.cheng.mail.product.vo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import com.cheng.common.to.MemberPrice;
/**
 * Auto-generated: 2021-12-03 21:13:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

@Data
public class Skus {

    private List<Attr> attr;
    private String skuName;
    private BigDecimal price;
    private String skuTitle;
    private String skuSubtitle;
    private List<Images> images;
    private List<String> descar;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;

}