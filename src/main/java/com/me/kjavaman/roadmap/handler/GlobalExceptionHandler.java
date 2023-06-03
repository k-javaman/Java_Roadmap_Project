package com.me.kjavaman.roadmap.handler;

import com.me.kjavaman.roadmap.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// This class handles global exceptions in the application.
@ControllerAdvice
public class GlobalExceptionHandler {

    // This method handles ResourceNotFoundException and returns an error view.
    @ExceptionHandler(ResourceNotFoundException.class)
    public ModelAndView handleResourceNotFoundException(ResourceNotFoundException e) {
        ModelAndView mav = new ModelAndView("error/404");
        mav.addObject("exception", e);
        return mav;
    }

    // other exception handlers...
}
