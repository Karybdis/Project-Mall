package com.cheng.mail.search.controller;

import com.cheng.mail.search.service.MallSearchService;
import com.cheng.mail.search.vo.SearchParam;
import com.cheng.mail.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SearchController {

    @Autowired
    MallSearchService mallSearchService;

    @GetMapping({"/","/list.html"})
    public String listPage(SearchParam param, Model model, HttpServletRequest request){
        param.set_queryString(request.getQueryString());
        SearchResult res=mallSearchService.search(param);
        model.addAttribute("result",res);
        return "list";
    }
}
