package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @Autowired
    private MyService myService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("index", "myModelName", myService.getMessage());
    }
}