package com.ibrahim.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormV2(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! "+theName;
        model.addAttribute("message", result);
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormV3(@RequestParam("studentName") String theName, Model model) {

        theName = theName.toUpperCase();
        String result = "Yo processFormV3.2! "+theName;
        model.addAttribute("message", result);
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }

    @PostMapping("/processFormVersionFour")
    public String processFormV4(@RequestParam("studentID") String theID, Model model) {


        String result = "Id of student is ! "+theID;
        model.addAttribute("message", result);
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }

}
