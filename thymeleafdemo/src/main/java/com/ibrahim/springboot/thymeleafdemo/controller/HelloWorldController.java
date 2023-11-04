package com.ibrahim.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String makeUppercase(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! "+theName;
        model.addAttribute("message", result);
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }

}
