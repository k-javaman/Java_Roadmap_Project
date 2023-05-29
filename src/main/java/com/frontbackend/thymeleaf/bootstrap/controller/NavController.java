package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

    @GetMapping("/guide")
    public String guide(Model model) {
        return "guide";
    }

    // Example
//    @GetMapping("/world")
//    public String main(Model model) {
//        return "contact";
//    }
}
