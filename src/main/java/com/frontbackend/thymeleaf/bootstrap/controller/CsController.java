package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CsController {
    @GetMapping("/CS/")
    public String htmlPage(Model model) {
        // Pass any specific data to HTML page
        return "/CS/Crash";
    }
}
