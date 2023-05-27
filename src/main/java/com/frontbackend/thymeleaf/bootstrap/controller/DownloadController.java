package com.frontbackend.thymeleaf.bootstrap.controller;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

public class DownloadController {
    @GetMapping(value = "/get-file", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> getFile() throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("/templates/modal_download_practice.pdf");
        byte[] contents = IOUtils.toByteArray(in);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename("modal_download_practice.pdf").build());

        return new ResponseEntity<>(contents, headers, HttpStatus.OK);
    }
}
