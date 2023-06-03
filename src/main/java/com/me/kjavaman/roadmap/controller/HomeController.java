package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.PageViewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// This controller handles requests related to the home page.
@Controller
public class HomeController {

    private final PageViewService pageViewService;

    public HomeController(PageViewService pageViewService) {
        this.pageViewService = pageViewService;
    }

    // This method returns the view for the home page and adds a URL to the model.
    @GetMapping("/")
    public String home(Model model) {
        Model url = pageViewService.getUrl(model);
        return "home";
    }
}