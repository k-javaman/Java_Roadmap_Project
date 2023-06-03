package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.HandleByLocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class HandleByLocaleController {
    private final HandleByLocaleService handleByLocaleService;

    @Autowired
    public HandleByLocaleController( HandleByLocaleService handleByLocaleService) {
        this.handleByLocaleService = handleByLocaleService;
    }

    // We should have this. otherwise, the button is disappeared..?
    @GetMapping("/home")
    public String homePage() {
        String languageCode = handleByLocaleService.getCountryCode();
        String viewPath = "home"; // Assuming "home" is the name of your home page Thymeleaf template
        return viewPath;
    }
}
