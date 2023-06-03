package com.me.kjavaman.roadmap.service;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Locale;

// This service handles actions that are dependent on the locale.
@Service
public class HandleByLocaleService {

    // This method returns a PDF file as a response based on the current locale.
    public ResponseEntity<InputStreamResource> getInputStreamResourceResponseEntity() throws IOException {
        String languageCode = getCountryCode();
        String fileName = languageCode.equals("ko") ? "ko_roadmap.pdf" : "en_roadmap.pdf";
        ClassPathResource pdfFile = new ClassPathResource("static/" + fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdfFile.getInputStream()));
    }

    // This method returns the current language code, defaulting to "en" (English) if the current language is not Korean.
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
}
