package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/important")
public class ImportantController {
    @GetMapping("/{page}")
    public String getPage(Model model, @PathVariable String page) {
        // Get the language code
        String languageCode = getCountryCode();

        // Construct the view path based on the language code and page
        String viewPath = "/" + languageCode + "/important/" + page;

        // Pass any specific data to HTML page
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
