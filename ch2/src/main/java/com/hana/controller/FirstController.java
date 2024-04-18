package com.hana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping("/")
    @ResponseBody
    public String root() throws Exception{
        return "this is root page";
    }

    @RequestMapping("/greeting")
    public String greeting(Model model){
        model.addAttribute("username", "박수진");
        return "greeting";
    }

    @RequestMapping("/bye")
    public String bye(Model model){
        model.addAttribute("username", "박수진");
        return "bye";
    }
}
