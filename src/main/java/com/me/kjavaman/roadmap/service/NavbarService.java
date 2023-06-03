package com.me.kjavaman.roadmap.service;

public class NavbarService {
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
}
