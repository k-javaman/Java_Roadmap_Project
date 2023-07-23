package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.PageViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// This controller handles requests for specific pages.
@Controller
@RequestMapping
public class PageViewController {

    private final PageViewService pageViewService;

    @Autowired
    public PageViewController(PageViewService pageViewService) {
        this.pageViewService = pageViewService;
    }


    // This method returns a view based on a specified directory and page name.
    @GetMapping("/{subdir}/{page}")
    public String getPage(Model model, @PathVariable String subdir, @PathVariable String page) {
        String viewPath = pageViewService.getViewPath(subdir, page);

        // Pass any specific data to HTML page
        return viewPath;
    }

    // This method changes the current language and redirects to a specified page or the home page if no redirect page is specified.
    @GetMapping("/changeLanguage")
    public String changeLanguage(@RequestParam String lang, @RequestParam(required=false) String redirect) {
        String getRedirectView = pageViewService.getRedirectPage(redirect);
        return getRedirectView;
    }
}
