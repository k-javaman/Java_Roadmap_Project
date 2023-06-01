package com.me.kjavaman.roadmap.handler;

import com.me.kjavaman.roadmap.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ModelAndView handleResourceNotFoundException(ResourceNotFoundException e) {
        ModelAndView mav = new ModelAndView("error/404");
        mav.addObject("exception", e);
        return mav;
    }

    // other exception handlers...
}
