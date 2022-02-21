package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("successful_authorization")
public class SuccessfulAuthorizationController {

    private static final String AUTHORIZATION_MESSAGE = "Successful Authorization";

    @GetMapping
    public String showSuccessfulAuthorization(Model model){
        model.addAttribute("message", AUTHORIZATION_MESSAGE);
        return "page";
    }

}
