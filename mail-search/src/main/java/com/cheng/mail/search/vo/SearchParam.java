package com.cheng.mail.search.vo;

import lombok.Data;

import java.util.List;

@Data
public class SearchParam {
    private String keyword;
    private Long catalog3Id;
    /**
     *
     * sort=saleCount_asc/desc
     * sort=skuPrice_asc/desc
     * sort=hotScore_asc/desc
     */
    private String sort;
    private Integer hasStock; //1=有库存 0=无库存
    private String skuPrice;
    private List<Long> brandId;
    private List<String> attrs;
    private Integer pageNum=1;

    private String _queryString;
}
