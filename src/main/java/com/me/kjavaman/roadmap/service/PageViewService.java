package com.me.kjavaman.roadmap.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

// This service determines the path for a specific view based on the locale and the page name.
@Service
public class PageViewService {

    private final HandleByLocaleService handleByLocaleService;

    public PageViewService(HandleByLocaleService handleByLocaleService) {
        this.handleByLocaleService = handleByLocaleService;
    }

    // This method returns the path to a specific view based on the directory and page name.
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

    // This method returns a redirect URL to a specified page or the home page if no redirect page is specified.
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

    // Retrieves the URL and adds it to the given model.
    // The URL represents the base URL of the Java Roadmap website.
    public Model getUrl(Model model) {
        String url = "http://java-roadmap-master-env.eba-wpejsbsa.ap-northeast-2.elasticbeanstalk.com/";
        model.addAttribute("url", url);
        return model;
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
