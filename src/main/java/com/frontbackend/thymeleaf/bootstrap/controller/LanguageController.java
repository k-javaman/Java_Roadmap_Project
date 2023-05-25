package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguageController {
    @GetMapping("/Language/")
    public String htmlPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/HTML";
    }
}
