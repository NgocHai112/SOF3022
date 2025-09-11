package com.example.lab1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/lab1")
    public String index() {
        return "index"; // trả về index.html
    }
}
