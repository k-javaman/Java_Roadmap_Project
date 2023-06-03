package com.me.kjavaman.roadmap.service;

import org.springframework.stereotype.Service;

@Service
public class PageViewService {

    private final HandleByLocaleService handleByLocaleService;

    public PageViewService(HandleByLocaleService handleByLocaleService) {
        this.handleByLocaleService = handleByLocaleService;
    }

    public String getViewPath(String subdir, String page) {
        // Get the language code
        String languageCode = handleByLocaleService.getCountryCode();

        // Don't prepend language code for error pages
        if (subdir.equals("error")) {
            return "/" + subdir + "/" + page;
        }

        // Construct the view path based on the language code and page
        String viewPath = "/" + languageCode + "/" + subdir + "/" + page;

        return viewPath;
    }

    public String getRedirectPage(String redirect) {
        // LocaleChangeInterceptor will take care of the language change
        if (redirect != null) {
            // If a redirect page was specified, go there
            return "redirect:" + redirect;
        } else {
            // If no redirect page was specified, default to home
            return "redirect:/home";
        }
    }

//    public String getViewPath(String page) {
//        // Get the language code
//        String languageCode = getCountryCode();
//
//        // Don't prepend language code for error pages
//        if (page.startsWith("error/")) {
//            return "/" + page;
//        }
//
//        // Construct the view path based on the language code and page
//        String viewPath = "/" + languageCode + "/" + page;
//
//        return viewPath;
//    }
}
