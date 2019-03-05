package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public ModelAndView index(@RequestParam("value") String value) {
        return new ModelAndView("index", "myModelName", value);
    }
}