package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/index/{value}")
    public ModelAndView index(@PathVariable String value) {
        return new ModelAndView("index", "myModelName", value);
    }
}