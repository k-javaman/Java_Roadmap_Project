package com.me.kjavaman.roadmap.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.ui.Model;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

// This class is responsible for the configuration related to Spring MVC.
@Configuration
public class WebConfig implements WebMvcConfigurer {
    // Configures a {@link MessageSource} bean for message localization using properties
    // files with the base name "messages" and UTF-8 encoding.
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages", "errors");
        messageSource.setDefaultEncoding("utf-8");
        return messageSource;
    }

    /**
     * Configures the locale resolver for the application.
     *
     * The locale resolver is responsible for resolving the user's locale based on the request.
     * In this implementation, the AcceptHeaderLocaleResolver is used, which resolves the locale based
     * on the "Accept-Language" header in the request. If no locale is specified in the header,
     * the default locale is set to "en_US".
     *
     * @return The configured locale resolver
     */
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US); // Set your default locale
        return localeResolver;
    }

//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
//        lci.setParamName("lang");
//        return lci;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(localeChangeInterceptor());
//    }

    // This method maps requests to specific paths to resources in the classpath.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**", "/en/css/**")
                .addResourceLocations("classpath:/static/css/", "classpath:/static/en/css/");
//        registry.addResourceHandler("/js/**", "/en/js/**")
//                .addResourceLocations("classpath:/static/js/", "classpath:/static/en/js/");
    }
}
