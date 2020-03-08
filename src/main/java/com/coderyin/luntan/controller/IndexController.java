package com.coderyin.luntan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(Model model) {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
