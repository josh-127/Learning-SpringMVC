package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        String method = request.getMethod();
        model.addAttribute("myModelName", method);
        return "index";
    }
}