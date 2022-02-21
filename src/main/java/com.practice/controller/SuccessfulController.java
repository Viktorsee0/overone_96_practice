package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessfulController {

    private static final String AUTHORIZATION_MESSAGE = "Successful Authorization";
    private static final String REGISTER_MESSAGE = "Successful Registration";

    @GetMapping("/successful_authorization")
    public String showSuccessfulAuthorization(Model model){
        model.addAttribute("message", AUTHORIZATION_MESSAGE);
        return "page";
    }

    @GetMapping("/successful_registration")
    public String showSuccessfulRegistrationPage(Model model){
        model.addAttribute("message", REGISTER_MESSAGE);
        return "page";
    }

}
