package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CsController {
    @GetMapping("/CS/crash")
    public String crashPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/crash";
    }

    @GetMapping("/CS/cs50")
    public String cs50Page(Model model) {
        // Pass any specific data to HTML page
        return "CS/cs50";
    }

    @GetMapping("/CS/nand-dsa")
    public String nandDsaPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/nand-dsa";
    }

    @GetMapping("/CS/cs-os-db-net")
    public String CaOsDbNetPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/ca-os-db-net";
    }

    @GetMapping("/CS/interview")
    public String interview(Model model) {
        // Pass any specific data to HTML page
        return "CS/interview";
    }
}
