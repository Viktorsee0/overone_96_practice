package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/successful_registration")
public class SuccessfulRegistrationController {
    private static final String REGISTER_MESSAGE = "Successful Registration";

    @GetMapping
    public String showSuccessfulRegistrationPage(Model model){
        model.addAttribute("message", REGISTER_MESSAGE);
        return "page";
    }
}
