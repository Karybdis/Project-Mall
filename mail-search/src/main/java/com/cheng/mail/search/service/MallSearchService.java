package com.cheng.mail.search.service;

import com.cheng.mail.search.vo.SearchParam;
import com.cheng.mail.search.vo.SearchResult;

public interface MallSearchService {
    SearchResult search(SearchParam param);
}
