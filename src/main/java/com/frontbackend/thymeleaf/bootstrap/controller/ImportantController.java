package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImportantController {
    @GetMapping("/Important/overview")
    public String overviewPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/overview";
    }
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

    @GetMapping("/Important/docker")
    public String dockerPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/docker";
    }

    @GetMapping("/Important/kubernetes")
    public String kubernetesPage(Model model) {
        // Pass any specific data to HTML page
        return "/Important/kubernetes";
    }
}
