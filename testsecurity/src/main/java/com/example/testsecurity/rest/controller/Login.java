package com.example.testsecurity.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Login {
    @GetMapping("/Login")
    String getLogin(Model model) {
        return "Login";
    }

    @GetMapping("/")
    String getHome(Model model) {
        return "HomePage";
    }
    @GetMapping("/RegistrationPage")
    String getRegistrationPage(Model model) {
        return "RegistrationPage";
    }
}
