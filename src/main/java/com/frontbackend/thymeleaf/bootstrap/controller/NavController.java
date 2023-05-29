package com.frontbackend.thymeleaf.bootstrap.controller;

import com.frontbackend.thymeleaf.bootstrap.service.PageLocalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class NavController {

    @GetMapping("/changeLanguage")
    public String changeLanguage(@RequestParam String lang) {
        // You do not need to do anything here, as the LocaleChangeInterceptor will take care of the language change
        return "redirect:/home";
    }

    // We should have this otherwise, the button is disappeared..?
    @GetMapping("/home")
    public String homePage() {
        String languageCode = getCountryCode();
        String viewPath = "home"; // Assuming "home" is the name of your home page Thymeleaf template
        return viewPath;
    }


    @GetMapping("/{page}")
    public String guidePage(Model model, @PathVariable String page) {
        String languageCode = getCountryCode();
        String viewPath = "/" + languageCode + "/" + page;
        return viewPath;
    }

    private String getCountryCode() {
        // Get the current Locale
        Locale currentLocale = LocaleContextHolder.getLocale();
        // Get the language code from the current Locale
        String languageCode = currentLocale.getLanguage();

        // Fallback to "en" if the current locale isn't "ko" (Korean)
        if (!"ko".equals(languageCode)) {
            languageCode = "en";
        }
        return languageCode;
    }
}
