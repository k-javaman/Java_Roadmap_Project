package com.me.kjavaman.roadmap.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DownloadService {

    private final PageLocalizationService pageLocalizationService;

    public DownloadService(PageLocalizationService pageLocalizationService) {
        this.pageLocalizationService = pageLocalizationService;
    }

    public ResponseEntity<InputStreamResource> getInputStreamResourceResponseEntity() throws IOException {
        String languageCode = pageLocalizationService.getCountryCode();
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
}
