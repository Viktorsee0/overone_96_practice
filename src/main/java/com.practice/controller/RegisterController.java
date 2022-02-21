package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("registration")
public class RegisterController {

    @GetMapping
    public String showRegisterPage(){
        return "register_page";
    }

    @PostMapping
    public String register(){
        return "redirect:/successful_registration";
    }

}
