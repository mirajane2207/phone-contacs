package com.chernenko.phonecontacs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
