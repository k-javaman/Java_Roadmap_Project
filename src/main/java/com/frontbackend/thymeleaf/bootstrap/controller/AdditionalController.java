package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdditionalController {
    @GetMapping("/Additional/")
    public String overviewPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/Overview";
    }
}
