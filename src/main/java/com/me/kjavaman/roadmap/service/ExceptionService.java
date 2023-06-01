package com.me.kjavaman.roadmap.service;

import com.me.kjavaman.roadmap.exception.ResourceNotFoundException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    public static void notfoundCheck(String page) {
        // Check if the page exists
        Resource resource = new ClassPathResource("/templates/" + page + ".html");
        if (!resource.exists()) {
            // Throw an exception if the page doesn't exist
            throw new ResourceNotFoundException("Page not found");
        }
    }
}
