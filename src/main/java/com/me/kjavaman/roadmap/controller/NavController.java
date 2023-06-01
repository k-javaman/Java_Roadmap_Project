package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.PageLocalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NavController {

    private final PageLocalizationService pageLocalizationService;

    @Autowired
    public NavController(PageLocalizationService pageLocalizationService) {
        this.pageLocalizationService = pageLocalizationService;
    }

    @GetMapping("/changeLanguage")
    public String changeLanguage(@RequestParam String lang, @RequestParam(required=false) String redirect) {
        // LocaleChangeInterceptor will take care of the language change
        if (redirect != null) {
            // If a redirect page was specified, go there
            return "redirect:" + redirect;
        } else {
            // If no redirect page was specified, default to home
            return "redirect:/home";
        }
    }

    // We should have this. otherwise, the button is disappeared..?
    @GetMapping("/home")
    public String homePage() {
        String languageCode = pageLocalizationService.getCountryCode();
        String viewPath = "home"; // Assuming "home" is the name of your home page Thymeleaf template
        return viewPath;
    }


    @GetMapping("/{page}")
    public String guidePage(Model model, @PathVariable String page) {
//        String viewPath = "/" + page;
        return "/guide";
    }
}
