package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.ExceptionCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ExceptionCheckController {

    private final ExceptionCheckService exceptionCheckService;

    @Autowired
    public ExceptionCheckController(ExceptionCheckService exceptionCheckService) {
        this.exceptionCheckService = exceptionCheckService;
    }

    @GetMapping("/{page}")
    public String guideExceptionCheckPage(Model model, @PathVariable String page) {
        String guideExceptionCheckedView = exceptionCheckService.notfoundCheck(page);
        return guideExceptionCheckedView;
    }
}
