package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImportantController {
    @GetMapping("/Important/git")
    public String gitPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/git";
    }

    @GetMapping("/Important/aws")
    public String awsPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/aws";
    }

    @GetMapping("/Important/linux")
    public String linuxPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/linux";
    }
}
