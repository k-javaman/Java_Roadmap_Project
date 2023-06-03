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
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

// This class is responsible for the configuration related to Spring MVC.
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // This method defines the default Locale (language and country) for the application.
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US); // Set your default locale
        return slr;
    }

    // This method creates an interceptor which will switch the language based on a lang parameter in a request.
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    // Configures a {@link MessageSource} bean for message localization using properties
    // files with the base name "messages" and UTF-8 encoding.
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    // This method registers the interceptor defined above in the application.
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    // This method maps requests to specific paths to resources in the classpath.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**", "/en/css/**")
                .addResourceLocations("classpath:/static/css/", "classpath:/static/en/css/");
//        registry.addResourceHandler("/js/**", "/en/js/**")
//                .addResourceLocations("classpath:/static/js/", "classpath:/static/en/js/");
    }
}
