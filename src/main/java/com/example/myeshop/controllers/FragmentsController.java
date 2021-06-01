package com.example.myeshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {

    @GetMapping("/style")
    public String styleByCss(Model model){
        return "fragments/global";
    }
}
