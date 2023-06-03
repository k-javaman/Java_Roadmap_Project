package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.DownloadService;
import com.me.kjavaman.roadmap.service.PageLocalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FileDownloadController {
    private final PageLocalizationService pageLocalizationService;
    private final DownloadService downloadService;

    @Autowired
    public FileDownloadController(PageLocalizationService pageLocalizationService, DownloadService downloadService) {
        this.pageLocalizationService = pageLocalizationService;
        this.downloadService = downloadService;
    }

    @GetMapping("/download")
    public ResponseEntity<InputStreamResource> downloadFile() throws IOException {
        return getInputStreamResourceResponseEntity();
    }

    private ResponseEntity<InputStreamResource> getInputStreamResourceResponseEntity() throws IOException {
        ResponseEntity<InputStreamResource> handlePDFDownloadByLanguage = downloadService.getInputStreamResourceResponseEntity();
        return handlePDFDownloadByLanguage;
    }
}
