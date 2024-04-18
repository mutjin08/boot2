package com.hana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
    @RequestMapping("/")
    @ResponseBody
    public String root() throws Exception{
        return "this is root page";
    }

    @RequestMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
}
