package com.me.kjavaman.roadmap.service;

import org.springframework.stereotype.Service;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

@Service
public class PageLocalizationService {

    public String getCountryCode() {
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

    public String getViewPath(String subdir, String page) {
        // Get the language code
        String languageCode = getCountryCode();

        // Don't prepend language code for error pages
        if (subdir.equals("error")) {
            return "/" + subdir + "/" + page;
        }

        // Construct the view path based on the language code and page
        String viewPath = "/" + languageCode + "/" + subdir + "/" + page;

        return viewPath;
    }

    public String getViewPath(String page) {
        // Get the language code
        String languageCode = getCountryCode();

        // Don't prepend language code for error pages
        if (page.startsWith("error/")) {
            return "/" + page;
        }

        // Construct the view path based on the language code and page
        String viewPath = "/" + languageCode + "/" + page;

        return viewPath;
    }
}
