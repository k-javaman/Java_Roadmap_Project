package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.PageViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class PageViewController {

    private final PageViewService pageViewService;

    @Autowired
    public PageViewController(PageViewService pageViewService) {
        this.pageViewService = pageViewService;
    }

    @GetMapping("/{subdir}/{page}")
    public String getPage(Model model, @PathVariable String subdir, @PathVariable String page) {
        String viewPath = pageViewService.getViewPath(subdir, page);

        // Pass any specific data to HTML page
        return viewPath;
    }

    @GetMapping("/changeLanguage")
    public String changeLanguage(@RequestParam String lang, @RequestParam(required=false) String redirect) {
        String getRedirectView = pageViewService.getRedirectPage(redirect);
        return getRedirectView;
    }
}