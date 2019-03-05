package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String indexGet() {
        return "index";
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public String indexPost() {
        return "redirect:/apple";
    }
}