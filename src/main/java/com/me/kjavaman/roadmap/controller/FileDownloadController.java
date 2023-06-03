package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.HandleByLocaleService;
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
    private final HandleByLocaleService handleByLocaleService;

    @Autowired
    public FileDownloadController( HandleByLocaleService handleByLocaleService) {
        this.handleByLocaleService = handleByLocaleService;
    }

    @GetMapping("/download")
    public ResponseEntity<InputStreamResource> downloadFile() throws IOException {
        ResponseEntity<InputStreamResource> handlePDFDownloadByLanguage = handleByLocaleService.getInputStreamResourceResponseEntity();
        return handlePDFDownloadByLanguage;
    }

    private ResponseEntity<InputStreamResource> getInputStreamResourceResponseEntity() throws IOException {
        ResponseEntity<InputStreamResource> handlePDFDownloadByLanguage = handleByLocaleService.getInputStreamResourceResponseEntity();
        return handlePDFDownloadByLanguage;
    }
}
