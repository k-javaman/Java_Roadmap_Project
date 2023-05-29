package com.frontbackend.thymeleaf.bootstrap.controller;

import com.frontbackend.thymeleaf.bootstrap.service.PageLocalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ModalPageController {

    private final PageLocalizationService pageLocalizationService;

    @Autowired
    public ModalPageController(PageLocalizationService pageLocalizationService) {
        this.pageLocalizationService = pageLocalizationService;
    }

    @GetMapping("/{subdir}/{page}")
    public String getPage(Model model, @PathVariable String subdir, @PathVariable String page) {
        String viewPath = pageLocalizationService.getViewPath(subdir, page);

        // Pass any specific data to HTML page
        return viewPath;
    }
}
