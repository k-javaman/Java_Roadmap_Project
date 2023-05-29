package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {
    @GetMapping("/must-have/html")
    public String htmlPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/html";
    }

    @GetMapping("/must-have/java")
    public String javaPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/java";
    }

    @GetMapping("/must-have/mysql")
    public String mysqlPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/mysql";
    }

    @GetMapping("/must-have/spring")
    public String springPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/spring";
    }

    @GetMapping("/must-have/jpa")
    public String jpaPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/jpa";
    }

    @GetMapping("/must-have/spring-security")
    public String securityPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/spring-security";
    }

    @GetMapping("/must-have/spring-unit-testing")
    public String testPage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/spring-unit-testing";
    }

    @GetMapping("/must-have/spring-microservice")
    public String springMicroservicePage(Model model) {
        // Pass any specific data to HTML page
        return "/must-have/spring-microservice";
    }
}
