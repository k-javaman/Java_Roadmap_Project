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
    @GetMapping("/CS/das")
    public String dsaPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/dsa";
    }
    @GetMapping("/CS/nand")
    public String nandPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/nand";
    }
    @GetMapping("/CS/ca")
    public String caPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/ca";
    }
    @GetMapping("/CS/os")
    public String osPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/os";
    }
    @GetMapping("/CS/db")
    public String dbPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/db";
    }
    @GetMapping("/CS/net")
    public String netPage(Model model) {
        // Pass any specific data to HTML page
        return "CS/net";
    }



    @GetMapping("/CS/interview")
    public String interview(Model model) {
        // Pass any specific data to HTML page
        return "CS/interview";
    }
}
