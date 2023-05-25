package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String main(Model model) {
        return "index";
    }

    @GetMapping("/HTML")
    public String htmlPage(Model model) {
        // Pass any specific data to HTML page
        return "HTML";
    }

    @GetMapping("/Crash")
    public String crashPage(Model model) {
        // Pass any specific data to Crash page
        return "Crash";
    }

    @GetMapping("/Overview")
    public String overviewPage(Model model) {
        // Pass any specific data to Overview page
        return "Overview";
    }
}