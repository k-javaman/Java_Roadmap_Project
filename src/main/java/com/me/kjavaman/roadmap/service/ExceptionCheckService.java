package com.me.kjavaman.roadmap.service;

import com.me.kjavaman.roadmap.exception.ResourceNotFoundException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

// This service checks if a specific page exists
@Service
public class ExceptionCheckService {

    // This method checks if a specific page exists and throws a ResourceNotFoundException if it doesn't.
    public String notfoundCheck(String page) {
        // Check if the page exists
        Resource resource = new ClassPathResource("/templates/" + page + ".html");
        if (!resource.exists()) {
            // Throw an exception if the page doesn't exist
            throw new ResourceNotFoundException("Page not found");
        }
        return "/" + page;
    }
}
