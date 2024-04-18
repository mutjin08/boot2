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

    @RequestMapping("/goodbye")
    public String bye(Model model){
        model.addAttribute("username", "박수진");
        return "goodbye";
    }

    @RequestMapping("/randomQuote")
    public String randomQuote(Model model){
        String[] quotes = {
                "고순이는 귀엽습니다. "+"(박수진)",
                "아프지 마 고순아. "+"(최도치)",
                "나는 멋진 도치 고순이! "+"(김고돌)"
        };
        int randInt = (int)(Math.random()*(quotes.length));
        model.addAttribute("quote", quotes[randInt]);
        return "randomQuote";
    }
}
