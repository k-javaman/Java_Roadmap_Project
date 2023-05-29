package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {
    @GetMapping("/Language/html")
    public String htmlPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/html";
    }

    @GetMapping("/Language/java")
    public String javaPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/java";
    }

    @GetMapping("/Language/mysql")
    public String mysqlPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/mysql";
    }

    @GetMapping("/Language/spring")
    public String springPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/spring";
    }

    @GetMapping("/Language/jpa")
    public String jpaPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/jpa";
    }

    @GetMapping("/Language/spring-security")
    public String securityPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/spring-security";
    }

    @GetMapping("/Language/spring-unit-testing")
    public String testPage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/spring-unit-testing";
    }

    @GetMapping("/Language/spring-microservice")
    public String springMicroservicePage(Model model) {
        // Pass any specific data to HTML page
        return "/Language/spring-microservice";
    }
}
