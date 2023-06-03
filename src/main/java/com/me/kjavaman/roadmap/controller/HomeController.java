package com.me.kjavaman.roadmap.controller;

import com.me.kjavaman.roadmap.service.HandleByLocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        String url = "http://java-roadmap-master-env.eba-wpejsbsa.ap-northeast-2.elasticbeanstalk.com/";
        model.addAttribute("url", url);
        return "home";
    }


}