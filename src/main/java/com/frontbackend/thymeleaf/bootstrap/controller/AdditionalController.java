package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdditionalController {
    @GetMapping("/Additional/overview")
    public String overviewPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/overview";
    }

    @GetMapping("/Additional/oop")
    public String oopPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/oop";
    }

    @GetMapping("/Additional/clean-code")
    public String cleanCodePage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/clean-code";
    }

    @GetMapping("/Additional/design-pattern")
    public String designPatternPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/design-pattern";
    }

    @GetMapping("/Additional/refactoring")
    public String refactoringPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/refactoring";
    }

    @GetMapping("/Additional/system-design")
    public String systemDesignPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/system-design";
    }

    @GetMapping("/Additional/unit-testing")
    public String unitTestingPage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/unit-testing";
    }

    @GetMapping("/Additional/microservice")
    public String microservicePage(Model model) {
        // Pass any specific data to Overview page
        return "/Additional/microservice";
    }
}
