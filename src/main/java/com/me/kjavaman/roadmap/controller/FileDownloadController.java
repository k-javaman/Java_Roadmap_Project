package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.HandleByLocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

// This controller handles the request for downloading a file.
@RestController
@RequestMapping("/api")
public class FileDownloadController {
    private final HandleByLocaleService handleByLocaleService;

    @Autowired
    public FileDownloadController( HandleByLocaleService handleByLocaleService) {
        this.handleByLocaleService = handleByLocaleService;
    }

    //  This method returns a PDF file as a response.
    @GetMapping("/download")
    public ResponseEntity<InputStreamResource> downloadFile() throws IOException {
        ResponseEntity<InputStreamResource> handlePDFDownloadByLanguage = handleByLocaleService.getInputStreamResourceResponseEntity();
        return handlePDFDownloadByLanguage;
    }
}
