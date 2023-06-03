package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.ExceptionService;
import com.me.kjavaman.roadmap.service.NavbarService;
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
    private final ExceptionService exceptionService;
    private final NavbarService navbarService;

    @Autowired
    public NavController(PageLocalizationService pageLocalizationService, ExceptionService exceptionService, NavbarService navbarService) {
        this.pageLocalizationService = pageLocalizationService;
        this.exceptionService = exceptionService;
        this.navbarService = navbarService;
    }

    @GetMapping("/changeLanguage")
    public String changeLanguage(@RequestParam String lang, @RequestParam(required=false) String redirect) {
        String getRedirectView = navbarService.getRedirectPage(redirect);
        return getRedirectView;
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
        String guideView = exceptionService.notfoundCheck(page);
        return guideView;
    }
}
